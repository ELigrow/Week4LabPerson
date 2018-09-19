package edu.wctc.eligrow;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> list = Startup.generateList();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.get(0).loseWeight(5);

        System.out.println(list.get(0).getWeight());

        list.get(0).addWeight(10);

        System.out.println(list.get(0).getWeight());
    }
}
