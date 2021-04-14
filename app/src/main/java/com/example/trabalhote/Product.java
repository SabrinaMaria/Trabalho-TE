package com.example.trabalhote;

public class Product {
    private String description;
    private boolean enabled;
    private String imageUrl;
    private String name;
    private float price;
    private float stockLevel;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(float stockLevel) {
        this.stockLevel = stockLevel;
    }
}
