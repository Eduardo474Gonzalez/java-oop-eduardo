package com.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Productos:");

        //Producto[] products = new Producto[5];

        //Crear 5 productos
        Product product1 = new Product("Aperitivos", "Aceitunas", "Verdes sin Hueso"
                , 1.49);
        Product product2 = new Product("Aperitivos","Aceitunas","Verdes manzanilla con anchoas"
                , 0.84);
        Product product3 = new Product("Aperitivos","Aceitunas","Rellena de anchoas"
                , 3.24);
        Product product4 = new Product("Aperitivos","Aceitunas","Rellena anchoa suave"
                , 1.40);
        Product product5 = new Product("Aperitivos","Aceitunas","Negra sin hueso"
                , 0.89);

        //Crear un array de productos
        Product[] arrayDeProductos = new Product[]{product1,product2,product3,product4,product5};

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        //Estadísticas
        //Calcular la suma precio total de los productos del array
        Double totalCost = 0d;
        for (Product product : arrayDeProductos) {
            totalCost += product.getCost();
        }
        System.out.println("Estadísticas:");
        System.out.println("Suma del precio total de los productos:"+totalCost);

        //Calcular la media de precio de los productos del array
        double averageCost = totalCost / arrayDeProductos.length;
        System.out.println("La media de precio de los productos: " + averageCost);

        //Calcular el precio máximo
        Double maxCost = arrayDeProductos[0].getCost();
        for (Product arrayDeProducto : arrayDeProductos) {
            if (arrayDeProducto.getCost() > maxCost) {
                maxCost = arrayDeProducto.getCost();
            }
        }
        System.out.println("El precio máximo: " + maxCost);
    }

}



