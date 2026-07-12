class Pen{
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called");
    }
}

class Employee {
    String name;
    int salary;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}

public class OOPS1{
    public static void main(String[] args) {
        String star = "*";

        // Pen
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        System.out.println(star.repeat(12));

        pen1.printColor();
        pen2.printColor();
        System.out.println(star.repeat(12));

        // student
        Student s1 = new Student();
        s1.name = "Jatin";
        s1.age = 18;

        s1.printInfo();
        System.out.println(star.repeat(12));

        // Employee
        Employee emp1 = new Employee("Rishi",22);
        emp1.printInfo();
    }
}