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
    private String description;
    private double price;

    public Meals() {
    }

    public Meals(String idMeal, String name, String description, double price) {
        this.idMeal = idMeal;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meals{" + "idMeal=" + idMeal + ", name=" + name + ", description=" + description + ", price=" + price + '}';
    }
    
    
}
