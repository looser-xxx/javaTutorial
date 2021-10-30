package oopsInJava;

import oppsExtentionEncapsulation.encapsulationIntro;

import java.io.*;

public class Main
{
    public static void main(String[] args)throws IOException
    {
//        Person p1=new Person();
//        p1.age=24;
//        p1.name="looser";
//
//        Person p2=new Person(31,"Shivam Sambuddha");
////        System.out.println(p1.age+" "+p1.name);
////        System.out.println(p2.age+" "+p2.name);
//
////        p1.eat();
////        p2.walk();
////        p2.walk(3);
////        System.out.println(Person.count);
//
//        Developer d1=new Developer(24, "Anuj");
//        d1.walk();



        encapsulationIntro obj=new encapsulationIntro();





    }
}

class Developer extends Person
{
    public Developer(int age, String newName)
    {
        super(age, newName);
    }

    void walk()
    {
        System.out.println("Developer "+name+" is walking.");
    }
}




class Person
{
    String name;
    int age;
    protected static int count;

//    public Person()
//    {
//        count++;
//        System.out.println("Creating an object");
//    }
    public Person(int age, String newName)
    {
        name=newName;
        this.age=age; //here both the way of initialising variables are accepted
    }

    public Person()
    {

    }


    void walk()
    {
        System.out.println(name+" is walking.");
    }
    void eat()
    {
        System.out.println(name+" is eating.");
    }
    void walk(int steps)
    {
        System.out.println(name+" walked "+steps+" steps.");
    }
}



























































































