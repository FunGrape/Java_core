package com.javalessons.lesson7;

import java.util.HashSet;
import java.util.Set;

public class Main {
        public static void main(String[] args){
            Set<String> set = new HashSet<>();
            set.add("Apple");
            set.add("Samsung");
            set.add("Amazon");
            set.add("Sony");

            if(set.contains("Sony")){
                System.out.print("Correct!");
            } else {
                System.out.print("There is no brand.");
            }
        }
    }