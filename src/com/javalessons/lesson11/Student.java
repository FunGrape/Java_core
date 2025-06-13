package com.javalessons.lesson11;
import java.util.List;
import java.util.Map;

public class Student {
    private Student student;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    private String name;
    private int age;
    private String major;
    private List<String> skills;
    private List<String> fridge;
    private Map<String, String> grades;
    private String quote;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }

    public List<String> getSkills(){
        return skills;
    }
    public void setSkills(List<String> skills){
        this.skills = skills;
    }

    public List<String> getFridge() {

        return fridge;
    }
    public void setFridge(List<String> fridge) {
        this.fridge = fridge;
    }

    public Map<String, String> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, String> grades) {
        this.grades = grades;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}