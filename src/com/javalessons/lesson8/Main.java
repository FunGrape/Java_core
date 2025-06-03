package com.javalessons.lesson8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> pair = new HashMap<>();

        pair.put("Sneakers", 2000);
        pair.put("T-shirts", 1000);
        pair.put("Hoodies", 1300);
        pair.put("Shirts", 1400);
        pair.put("Sunglasses", 900);

        System.out.print(pair);
    }
}
