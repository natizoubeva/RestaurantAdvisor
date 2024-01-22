/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.smg.model;

/**
 *
 * @author Natalia
 */
public class Restaurant {
        
    private int id;
    private int owner_id;
    private String name;
    private String address;
    private int number_reviews;
    private double rating;
    private PricePoint price_point;
    private String image;

    public Restaurant() {
    }

    
    public Restaurant(int owner_id, String name) {
        this.owner_id = owner_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
    
    public int getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber_reviews() {
        return number_reviews;
    }

    public double getRating() {
        return rating;
    }


    public PricePoint getPricePoint() {
        return price_point;
    }

    public void setPricePoint(PricePoint price_point) {
        this.price_point = price_point;
    }

    public String getImage() {
        return  image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "id=" + id + ", owner_id=" + owner_id + ", name=" + name + ", address=" + address + ", number_reviews=" + number_reviews + ", rating=" + rating + ", price_point=" + price_point + ", image=" + image + '}';
    }

    
}
