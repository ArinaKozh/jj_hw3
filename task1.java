package ru.geekbrains.junior.lesson3.hw3;

import ru.geekbrains.junior.lesson3.task1.UserData;
import ru.geekbrains.junior.lesson3.task2.ToDoListApp;
import ru.geekbrains.junior.lesson3.task2.ToDoV2;

import java.io.*;
import java.util.List;
import java.util.Scanner;

import static ru.geekbrains.junior.lesson3.task2.ToDoListApp.*;
import static ru.geekbrains.junior.lesson3.task2.ToDoListApp.displayTasks;

public class task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 22, 5.0);
        File f = new File("studentData.json");
        App.saveStudentDataToFile("studentData.json", student);
        if (f.exists() && !f.isDirectory()) {
            student = App.loadStudentDataFromFile("studentData.json");
        }
        System.out.println(student);
        System.out.println();

        File ff = new File("studentData.xml");
        App.saveStudentDataToFile("studentData.xml", student);
        if (ff.exists() && !ff.isDirectory()) {
            student = App.loadStudentDataFromFile("studentData.xml");
        }
        System.out.println(student);

    }
}
