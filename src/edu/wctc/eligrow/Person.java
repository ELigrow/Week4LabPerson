package edu.wctc.eligrow;

public class Person implements Weighable {
    public String fName;
    public String lName;
    public int age;
    public static String species = "Homo Sapien";
    public static boolean isAlive = true;
    public int weight;


    public Person(String fName, String lName, int age, int weight) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.weight = weight;
    }

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.weight = 150;
    }


    public Person(String fName, int age, int weight) {
        this.fName = fName;
        lName = "";
        this.age = age;
        this.weight = weight;
    }

    public Person(String lName, int weight) {
        fName = "";
        this.lName = lName;
        age = 0;
        this.weight = weight;
    }

    public Person(String lName) {
        fName = "";
        this.lName = lName;
        age = 0;
        this.weight = 150;
    }

    @Override
    public void addWeight(int lbs) {
        this.weight = weight + lbs;
    }

    @Override
    public void loseWeight(int lbs) {
        this.weight = weight - lbs;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        String toString = ("Name: " + fName + " " + lName + " | Age:" + age + "  | Species: " + species +
                " | Is alive (T/F): " + isAlive + " | Weight: " + weight);
        return toString;
    }
}
