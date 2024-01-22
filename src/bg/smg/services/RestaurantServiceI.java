/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bg.smg.services;

import bg.smg.model.Restaurant;
import bg.smg.model.User;
import java.util.ArrayList;

/**
 *
 * @author Natalia
 */
public interface RestaurantServiceI {
    public ArrayList<Restaurant> getAll();
    public void addNewRestaurant(Restaurant restaurant);
    public ArrayList<Restaurant> getRestaurantsForUser(User user);
    public void updateRestaurant(Restaurant restaurant, User owner);
    public void deleteRestaurant(Restaurant restaurant);
}
