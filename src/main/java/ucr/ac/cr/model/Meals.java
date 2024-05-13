/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.model;

/**
 *
 * @author Jason
 */
public class Meals {

    private String idMeal;
    private String name;
    private int quantity;
    private double price;

    public Meals() {
    }

    public static final String[] HEADER_MEALS = {"Id Meal", "Name", "Quantity", "Price"};

    public Meals(String idMeal, String name, int quantity, double price) {
        this.idMeal = idMeal;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getIdMeal() {
        return idMeal;
    }

    public void setIdMeal(String idMeal) {
        this.idMeal = idMeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meals{" + "idMeal=" + idMeal + ", name=" + name + ", quantity=" + quantity + ", price=" + price + '}';
    }

}
