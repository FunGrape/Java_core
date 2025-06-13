package org.example;

public class Main {
    public static void main(String[] args){
        JsonWorker worker = new JsonWorker();
        String json = worker.toJson();
        String studentJson = worker.toObject(json);

        System.out.println(studentJson);
    }
}