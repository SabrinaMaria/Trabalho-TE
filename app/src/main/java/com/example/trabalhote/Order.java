package com.example.trabalhote;

import java.util.ArrayList;

public class Order {
    private Integer customerId;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}