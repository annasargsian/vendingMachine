package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<Product, Integer> product = new LinkedHashMap<>();
        product.put(new Cola(), 10);
        product.put(new Fanta(), 10);
        product.put(new Pepsi(),10);
        VendingMachine.vendingMachine.put("A", product);
        LinkedHashMap<Product, Integer> product1 = new LinkedHashMap<>();
        product1.put(new Lays(), 10);
        product1.put(new Pringles(),10);
        product1.put(new Cheetos(),10);
        VendingMachine.vendingMachine.put("B",product1);
        LinkedHashMap<Product, Integer> product2 = new LinkedHashMap<>();
        product2.put(new MilkyWay(),10);
        product2.put(new Twix(),10);
        product2.put(new Mars(),10);
        VendingMachine.vendingMachine.put("C",product2);

        Scanner scanner = new Scanner(System.in);
        System.out.println(VendingMachine.getProduct(scanner.nextLine()).getName());
    }
}
 