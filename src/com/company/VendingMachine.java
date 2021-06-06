package com.company;

import com.company.*;

import java.util.*;

public class VendingMachine {
    public static HashMap<String, LinkedHashMap<Product, Integer>> vendingMachine = new HashMap<>();


    public static Product getProduct(String position) {
        String[] temp = position.split(":");
        String row = temp[0];
        int column = Integer.parseInt(temp[1]);
        LinkedHashMap<Product, Integer> rowProduct = vendingMachine.get(row);

        List<Map.Entry<Product, Integer>> rowList = new ArrayList<>(rowProduct.entrySet());
        Product product = rowList.get(column).getKey();
        rowProduct.put(product, rowProduct.get(product) - 1);
        return product;
    }

}
