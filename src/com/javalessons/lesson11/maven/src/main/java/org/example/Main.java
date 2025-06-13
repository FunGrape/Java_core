package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        org.example.JsonWorker worker = new org.example.JsonWorker();
        String json = worker.toJson();
        String studentJson = worker.toObject(json);

        System.out.println(studentJson);
    }
}