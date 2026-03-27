package org.example;

public class Main {
    public static void main(String[] args){
        JsonWorker worker = new JsonWorker();
        String json = worker.toJson();
        Student studentJson = worker.fromStudent(json);
        String studentObject = worker.toString(studentJson);

        System.out.print(json);
        System.out.print(studentObject);
    }
}