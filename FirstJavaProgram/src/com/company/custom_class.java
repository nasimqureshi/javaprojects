package com.company;

class Employee {
    int id;
    String name;
    public void pintDetails(){
        System.out.println("My id is: "  + id);
        System.out.println("ans my name is:" + name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        //Instantiating new object.
        Employee Nasim  = new Employee();
        Employee Qamar = new Employee();

        //setting attributes.
        Nasim.id =13;
        Nasim.name = "CodeWithNasim";
        Qamar.id = 18;
        Qamar.name = "qamar qureshi";
        //System.out.println(Nasim.id);
        //System.out.println(Nasim.name);
        Nasim.pintDetails();
        Qamar.pintDetails();

    }

}
