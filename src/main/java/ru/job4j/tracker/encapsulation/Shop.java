package ru.job4j.tracker.encapsulation;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
        System.out.println(indexOfNull(products));
    }

    public static int indexOfNull(Product[] products) {
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            Product pr = products[i];
            if (pr == null) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}
