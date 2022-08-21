package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int i = 0; i < products.length; i++) {
            Product pr = products[i];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println();
        System.out.println("Replace milk to oil.");
        System.out.println();
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int i = 0; i < products.length; i++) {
            Product pd = products[i];
            System.out.println(pd.getName() + " - " + pd.getCount());
        }
        System.out.println();
        System.out.println("Show only product.count > 10");
        System.out.println();
        for (int i = 0; i < products.length; i++) {
            Product ps = products[i];
            if (ps.getCount() > 10) {
                System.out.println(ps.getName() + " - " + ps.getCount());
            }
        }
    }
}
