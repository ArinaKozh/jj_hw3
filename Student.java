package ru.geekbrains.junior.lesson3.hw3;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;

    private int age;


    @JsonIgnore
    transient double gpa;

    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public Student(){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  double getGPA(){
        return gpa;
    }

    @Override
    public String toString() {
        return "Студент "+name+" "+age+" года"+"\n Средний балл:"+gpa;
    }
}
