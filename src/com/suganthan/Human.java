package com.suganthan;

/**
 * Created by 527360 on 8/4/2017.
 */
public class Human {

    private String name;
    private int age;

    public Human() {
        super();
    }

    public Human(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public static int compareByNameThenAge(Human h1, Human h2) {
        if(h1.getName().equals(h2.getName())) {
            return h1.getAge() - h1.getAge();
        } else {
            return h1.getName().compareTo(h2.getName());
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
