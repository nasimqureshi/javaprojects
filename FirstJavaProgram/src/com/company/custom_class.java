package com.company;

class Employee {
    int id;
    String name;
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        //Instantiating new object.
        Employee Nasim  = new Employee();

        //setting attributes.
        Nasim.id =13;
        Nasim.name = "CodeWithNasim";
        System.out.println(Nasim.id);
        System.out.println(Nasim.name);

    }

}
