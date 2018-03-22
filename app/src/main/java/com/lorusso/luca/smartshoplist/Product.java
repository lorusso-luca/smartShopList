package com.lorusso.luca.smartshoplist;

/**
 * Created by Luca on 19/03/2018.
 */

public class Product {

    private int id;
    private String name;
    private String description;
    private int quantity;

    private Category category;


    public Product(int id, String name, String description, int quantity, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
