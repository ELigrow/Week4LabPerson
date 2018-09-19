package edu.wctc.eligrow;

import java.util.ArrayList;

public class Startup {

    static ArrayList<Person> startList = new ArrayList<Person>();

    public static ArrayList<Person> generateList() {
        for (int i = 0; i < 20; i++) {
            Person dave = new Person("Dave", "Smith", 23);
            startList.add(dave);
        }


        return startList;
    }
}
