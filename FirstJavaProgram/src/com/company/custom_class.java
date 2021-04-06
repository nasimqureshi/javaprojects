package com.company;

import java.rmi.Naming;

class Employee {
    int id;
    String name;
    int salary;
    public void pintDetails(){
        System.out.println("My id is: "  + id);
        System.out.println("ans my name is:" + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        //Instantiating new object.
        Employee Nasim  = new Employee();
        Employee Qamar = new Employee();

        //setting attributes for Nasim.
        Nasim.id =13;
        Nasim.name = "CodeWithNasim";
        Nasim.salary = 122000;
        //setting attributes for Qamar.
        Qamar.id = 18;
        Qamar.name = "qamar qureshi";
        Qamar.salary = 130000;
        //System.out.println(Nasim.id);
        //System.out.println(Nasim.name);
        Nasim.pintDetails();
        Qamar.pintDetails();
        int salary = Nasim.salary;
        System.out.println(salary);



    }

}
