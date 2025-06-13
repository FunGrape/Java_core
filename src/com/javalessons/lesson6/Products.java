package com.javalessons.lesson6;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args){
        List<String> products = new ArrayList<>();

        products.add("Nike, 3000 uah, sneakers");
        products.add("House, 800 uah, hoodie");
        products.add("Colins, 1600 uah, jacket");

        for(String product : products){
            System.out.println(product);
        }
    }
}