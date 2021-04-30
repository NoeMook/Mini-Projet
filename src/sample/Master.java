package sample;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.Scanner;

public class Master extends Student{
    private Option option;

    public Master(String lastName, String name, int yearOfBirth, Promotion promo, Option option) {
        super(lastName, name, yearOfBirth, promo);
        this.option = option;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
    public StringProperty optionProperty(){
        String r = "";
        if (option != null){
            r = (String) option.toString();
        }
        return new SimpleStringProperty(r);
    }
    /*
        fonction pour ajouter un étudiant
     */
}
