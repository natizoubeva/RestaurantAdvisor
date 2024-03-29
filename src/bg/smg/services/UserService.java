/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg.services;

import bg.smg.model.Role;
import javax.sql.DataSource;
import java.sql.Connection;
import bg.smg.model.User;
import bg.smg.util.DBManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class UserService implements UserServiceI {

    private DataSource dataSource;
    private Connection connection;

    public UserService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }

    @Override
    public void saveUser(User user) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO `users`(`username`, `name`, `password`, `created`, `is_active`, `profile_pic`) "
                    + "VALUES (?, ?, ?, ?, ?, ?)")) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getName());
                statement.setString(3, user.getPassword());
                statement.setString(4, String.valueOf(user.getTimestamp()));
                statement.setBoolean(5, user.isActive());
                statement.setString(6, user.getImage());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User saved successfully!");
                } else {
                    System.out.println("Failed to save user.");
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
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
    public User getUserById(int id) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE id=?")) {
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                resultSet.first();
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setTimestamp(resultSet.getTimestamp("created"));
                user.setActive(resultSet.getBoolean("is_active"));
                user.setImage(resultSet.getString("profile_pic"));
                user.setRole(Role.valueOf(resultSet.getString("role")));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
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
    public User getUserByUsername(String username) throws SQLException {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE username=?")) {
                statement.setString(1, username);
                ResultSet resultSet = statement.executeQuery();
                resultSet.first();
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setTimestamp(resultSet.getTimestamp("created"));
                user.setActive(resultSet.getBoolean("is_active"));
                user.setImage(resultSet.getString("profile_pic"));
                user.setRole(Role.valueOf(resultSet.getString("role")));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Closing database connection...");
                connection.close();
                System.out.println("Connection valid: " + connection.isValid(5));
            }
        }
        return null;
    }

    public String encode(String password) {
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
        return encodedPassword;
    }

    @Override
    public boolean verifyUser(User user) throws SQLException {
        User registeredUser = getUserByUsername(user.getUsername());
        String encodedPwd = encode(user.getPassword());
        return registeredUser != null && registeredUser.getPassword().equals(encodedPwd);
    }

    public String decodePassword(String passwordToDecode) {
        byte[] decodedBytes = Base64.getDecoder().decode(passwordToDecode);
        return new String(decodedBytes);
    }

    @Override
    public void updateForgottenPassword(User user) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE `users` SET `password`=? "
                    + "WHERE `username` =?")) {
                statement.setString(1, user.getPassword());
                statement.setString(2, user.getUsername());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User password changed successfully!");
                } else {
                    System.out.println("Failed to change user password.");
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
    public void updateUser(User user) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE `users` SET `username`=?, `name`=?, `profile_pic`=? "
                    + "WHERE `id`=?")) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getName());
                statement.setString(3, user.getImage());
                statement.setInt(4, user.getId());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User updated successfully!");
                } else {
                    System.out.println("Failed to update user information.");
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
    public void changeOwnershipStatus(User user) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "UPDATE `users` SET `role`=?"
                    + "WHERE `id`=?")) {
                statement.setString(1, user.getRole().toString());
                statement.setInt(2, user.getId());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User role updated successfully!");
                } else {
                    System.out.println("Failed to update user role.");
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
    public void verifyOwnershipStatus(User user) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM `restaurants` WHERE `owner_id`=?")) {
                statement.setInt(1, user.getId());

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                } else {
                    if (user.getRole() == Role.OWNER) {
                        user.setRole(Role.USER);
                    }
                    changeOwnershipStatus(user);
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
    public void deleteUser(User user
    ) {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM `users` WHERE `id`=?")) {
                statement.setInt(1, user.getId());

                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User deleted successfully!");
                } else {
                    System.out.println("Failed to delete user.");
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
