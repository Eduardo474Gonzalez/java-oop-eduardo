package com.example;


import java.util.Arrays;

public class Product {
    private String category;
    private String name;
    private String[] specifications;
    private Double price;

    public Product() {}
    public Product(String category, String name, String[] specifications, Double price) {
        this.category = category;
        this.name = name;
        this.specifications = specifications;
        this.price = price;
    }

   // Getters and setters

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSpecifications() {
        return specifications;
    }
    public void setSpecifications(String[] specifications) {
        this.specifications = specifications;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", specifications=" + Arrays.toString(specifications) +
                ", price=" + price +
                '}';
    }
}










































