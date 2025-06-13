package org.example;
import com.google.gson.Gson;

public class JsonWorker {
        public String toJson() {
            Gson gson = new Gson();
            String json = "{\"name\":\"Оля Прокрастиненко\",\"age\":19,\"major\":\"Мистецтво Виживання\",\"skills\":[\"здача дедлайнів в останню хвилину\",\"читання конспектів уві сні\"],\"fridge\":[\"вода\",\"шматок сиру\",\"порожній контейнер\"],\"grades\":{\"історія\":\"B\",\"англійська\":\"A-\"},\"quote\":\"Посплю 5 хвилин і почну вчитись\"}";
            Student student = gson.fromJson(json, Student.class);

            System.out.println("Ім'я: " + student.getName());
            System.out.println("Вік: " + student.getAge());
            System.out.println("Головна навичка: " + student.getMajor());
            System.out.println("Навички:" + student.getSkills());
            System.out.println("В холодильнику:" + student.getFridge());
            System.out.println("Оцінки: " + student.getGrades());
            System.out.println("Цитата:" + student.getQuote());
            return json;
        }
        public Student fromStudent(String json){
            Gson gson = new Gson();
            Student student = gson.fromJson(json, Student.class);
            return student;

        }
        public String toString(Student student){
            Gson gson = new Gson();
            String studentObject = gson.toJson(student, Student.class);
            return studentObject;
        }
    }