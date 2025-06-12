package org.example;


import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {
        JsonWorker worker = new JsonWorker();
        String json = worker.toJson();
        String studentJson = worker.toObject(json);

        System.out.println(studentJson);
    }
}