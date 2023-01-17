package com.example;

public class Main {

    public static void main(String[] args) {

        Product product01 = new Product();
        Product product02 = new Product();
        Product product03 = new Product();
        Product product04 = new Product();
        Product product05 = new Product();

        Double totalPrice;
        Double average;
        Double maxPrice;

        Product[] products = { product01, product02, product03, product04, product05 };

        totalPrice = calculateTotalPrice(products);
        System.out.println(totalPrice);

        average = calculateAveragePrice(products);
        System.out.println(average);

        maxPrice = getMaxPrice(products);
        System.out.println(maxPrice);

    }

    public static Double calculateTotalPrice(Product[] products) {
        Double total = 0.0d;

        for (Product i : products) {
            total += i.getPrice();
        }
        return total;
    }

    public static Double calculateAveragePrice(Product[] products) {
        Double sum;

        sum = calculateTotalPrice(products);
        return sum/products.length;
    }

    public static Double getMaxPrice(Product[] products) {
        Double max = 0.0d;

        for (Product i : products) {
            max = Math.max(max, i.getPrice());
        }
        return max;
    }
}

