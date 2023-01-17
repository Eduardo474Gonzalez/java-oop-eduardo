package com.example;


import java.util.Arrays;

public class Product {
    //atributos encapsulados (private)
    private String category;
    private String name;
    private String description;
    private Double cost;

    //private Manufacturer manufacturer;
    //constructores
    //vacio
    public Product() {
    }

    //con todos los parámetros
    public Product(String category, String name, String description, Double cost) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.cost = cost;
        //this.manufacturer = manufacturer;
    }
    //métodos getter setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String title) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }



    /* public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }*/
    //método toString

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}










































