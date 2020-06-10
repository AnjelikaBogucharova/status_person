package com.anjelika;

import com.anjelika.personConfig.Person;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person(true, "Валентин");
        Person p2 = new Person(false, "Александра");
        Person p3 = new Person(true, "Евгений");
        Person p4 = new Person(false, "Мария");
        Person p5 = new Person(true, "Петр");
        Person p6 = new Person(false, "Земфира");

        p1.marry(p2);
        p3.marry(p4);
        p2.divorce();
        p3.marry(p1);
        p6.marry(p1);
        p2.marry(p5);
    }
}
