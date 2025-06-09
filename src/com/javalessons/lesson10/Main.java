package com.javalessons.lesson10;

class InvalidProductNameException extends Exception {
    public InvalidProductNameException(String message){
        super(message);
    }
}

class Main {
    public static void validateProductName(String name) throws InvalidProductNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductNameException("Неправильна назва товару.");
        } else {
            System.out.println("Назва товару вказана вірно: " + name);
        }
    }
    public static void main(String[] args){
        try {
        validateProductName("Молоко");
        validateProductName("Сир");
        validateProductName("    ");
    } catch(InvalidProductNameException e){
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}