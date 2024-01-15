/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg.model;

/**
 *
 * @author Natalia
 */
public class Review {
    private int id;
    private int user_id;
    private int restaurant_id;
    private String description;
    private int stars;

    public Review(int user_id, int restaurant_id) {
        this.user_id = user_id;
        this.restaurant_id = restaurant_id;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return user_id;
    }

    public int getRestaurantId() {
        return restaurant_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", user_id=" + user_id + ", restaurant_id=" + restaurant_id + ", description=" + description + ", stars=" + stars + '}';
    }
    
    
    
}
