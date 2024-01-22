/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg.services;

import bg.smg.model.PricePoint;
import bg.smg.model.Restaurant;
import bg.smg.model.User;
import bg.smg.util.DBManager;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Natalia
 */
public class RestaurantService implements RestaurantServiceI {

    private DataSource dataSource;
    private Connection connection;

    public RestaurantService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }

    @Override
    public ArrayList<Restaurant> getAll() {
        try {
            ArrayList<Restaurant> restaurants = new ArrayList<>();
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM `restaurants`")) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Restaurant restaurant = new Restaurant();
                    restaurant.setId(resultSet.getInt("id"));
                    restaurant.setOwnerId(resultSet.getInt("owner_id"));
                    restaurant.setName(resultSet.getString("name"));
                    restaurant.setAddress(resultSet.getString("address"));
                    restaurant.setPricePoint(PricePoint.valueOf(resultSet.getString("price_point")));
                    restaurant.setImage(resultSet.getString("image"));
                    restaurants.add(restaurant);
                }
                return restaurants;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    System.out.println("Closing database connection...");
                    connection.close();
                    System.out.println("Connection valid: " + connection.isValid(5));
                } catch (SQLException ex) {
                    Logger.getLogger(RestaurantService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public void addNewRestaurant(Restaurant restaurant) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO `restaurants` (`owner_id`, `name`, `address`, `price_point`, `image`) "
                    + "VALUES (?, ?, ?, ?, ?)")) {
                statement.setInt(1, restaurant.getOwnerId());
                statement.setString(2, restaurant.getName());
                statement.setString(3, restaurant.getAddress());
                statement.setString(4, restaurant.getPricePoint().toString());
                statement.setString(5, restaurant.getImage());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Restaurant saved successfully!");
                } else {
                    System.out.println("Failed to save restaurant.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    System.out.println("Closing database connection...");
                    connection.close();
                    System.out.println("Connection valid: " + connection.isValid(5));
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public ArrayList<Restaurant> getRestaurantsForUser(User user) {
        try {
            ArrayList<Restaurant> restaurants = new ArrayList<>();
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM `restaurants` WHERE restaurants.owner_id = ?")) {
                statement.setInt(1, user.getId());
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Restaurant restaurant = new Restaurant();
                    restaurant.setId(resultSet.getInt("id"));
                    restaurant.setOwnerId(resultSet.getInt("owner_id"));
                    restaurant.setName(resultSet.getString("name"));
                    restaurant.setAddress(resultSet.getString("address"));
                    restaurant.setPricePoint(PricePoint.valueOf(resultSet.getString("price_point")));
                    restaurant.setImage(resultSet.getString("image"));
                    restaurants.add(restaurant);
                }
                return restaurants;

            }
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    System.out.println("Closing database connection...");
                    connection.close();
                    System.out.println("Connection valid: " + connection.isValid(5));
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public void updateRestaurant(Restaurant restaurant, User owner) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE `restaurants` SET `name`=?,`address`=?,`price_point`=?,`image`=?"
                    + "WHERE `owner_id`=?")) {
                statement.setString(1, restaurant.getName());
                statement.setString(2, restaurant.getAddress());
                statement.setString(3, restaurant.getPricePoint().toString());
                statement.setString(4, restaurant.getImage());
                statement.setInt(5, owner.getId());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Restaurant updated successfully!");
                } else {
                    System.out.println("Failed to update restaurant information.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    System.out.println("Closing database connection...");
                    connection.close();
                    System.out.println("Connection valid: " + connection.isValid(5));
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM `restaurants` WHERE `id`=?")) {
                statement.setInt(1, restaurant.getId());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Restaurant deleted successfully!");
                } else {
                    System.out.println("Failed to delete restaurant.");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    System.out.println("Closing database connection...");
                    connection.close();
                    System.out.println("Connection valid: " + connection.isValid(5));
                } catch (SQLException ex) {
                    Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
