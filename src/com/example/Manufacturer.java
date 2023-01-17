package com.example;

public class Manufacturer {
    //Crear una clase Manufacturer
    private String name;
    private String contact;

    public Manufacturer() {
    }

    public Manufacturer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    //Asociar la clase a Product, de manera que un producto tiene un fabricante
}

