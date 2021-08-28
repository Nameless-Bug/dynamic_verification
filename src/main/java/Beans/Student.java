package Beans;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.certificate = new ArrayList<String>();
    }
    String name;
    int age;
    List<String> certificate;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void addCertificate(String certificate){
        this.certificate.add(certificate);
    }

    void goToSchool(){
        System.out.println("Young students should go to school.");
    }

    void drive(){
        System.out.println("Students with driver license are allowed to drive.");
    }

    Homework doHomework(Integer math, String history){
        System.out.println("method with parameters");
        return new Homework(math, history);
    }

    Homework doHomework(){
        System.out.println("method with no parameters");
        return new Homework(1, "history");
    }
}
