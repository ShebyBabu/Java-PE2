package com.stackroute.practice02;

//3. Create a class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//        member variables, and then displays the value of each member variable.
//        Output:
//        Members Name: Harry Potter
//        Members Age: 30
//        Members Salary: 2500.3


public class MemberClass {          //creating first class and its corresponding variables
    String name;
    int age;
    float salary;


    public MemberClass(String name,int age,float salary) {      //creating a constructor
        this.name = name;
        this.age=age;
        this.salary=salary;
    }

    public void display()           //creating display method
    {
        System.out.println("MEMBER NAME: "+name);
        System.out.println("MEMBER AGE: " +age);
        System.out.println("MEMBER SALARY: "+salary);
    }


}

class MemberVariable {
    public static void main(String[] args) {
        MemberClass m=new MemberClass("Harry Potter", 30, 2500);        //creating the instance of class
        m.display();
    }


}
