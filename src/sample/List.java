package sample;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 * Class that allow to create a student list
 *
 * @author: Group HCI BD 34
 *
 * @version 30/04/2021
 */

public class List {
    private ObservableList<Student> studentList;

    public List() {
        this.studentList = FXCollections.observableArrayList();
    }

    //List of student
    public ObservableList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ObservableList<Student> studentList) {
        this.studentList = studentList;
    }

    //Add student without option in argument
    public void addStudent(String lastName, String name, int yearOfBirth, Promotion promo){
        if (promo == Promotion.L3) {
            this.studentList.add(new Student(lastName, name, yearOfBirth, promo));
        }
    }

    //Add a student with option in arguments
    public void addStudent(String lastName, String name, int yearOfBirth, Promotion promo, Option opt){
        if (promo == Promotion.L3){
            this.studentList.add(new Student(lastName, name, yearOfBirth, promo));
        }else {
            this.studentList.add(new Master(lastName, name, yearOfBirth, promo, opt));
        }
    }
//Allow user to delete a student
    public void deleteStudent(String name, String lastName) {
        for (Student s : this.studentList) {
            if (s.getName() == name && s.getLastName() == lastName) {
                this.studentList.remove(s);
            }
        }
    }
//Method to fill data to use the different method of the software
    public void fillData(){
        addStudent("DELL","Robert", 1999, Promotion.L3);
        addStudent("DOMINO", "Toto", 1998, Promotion.M1,Option.BIOTECHNOLOGIE);
        addStudent("DUPONT","Pierre", 1997, Promotion.M2,Option.IMAGERIE);
    }
}
