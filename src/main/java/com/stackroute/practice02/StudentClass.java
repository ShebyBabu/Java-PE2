package com.stackroute.practice02;


import java.util.Scanner;

//6. Write a program, which reads number of students and n grades as input (of int
//between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//program shall check for valid input. You should keep all the grades in an int[] and use a
//method for each of the computations.
//Output:
//Enter the number of students: 4
//Enter the grade for student 1: 86
//Enter the grade for student 2: 65
//Enter the grade for student 3: 98
//Enter the grade for student 4: 77The average is 81.50
//The minimum is 65
//The maximum is 98
public class StudentClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents=s.nextInt();
        int i;
        int[] gradesArray= new int[numberOfStudents];
        System.out.println("Enter the grades : ");
        for(i=0;i<numberOfStudents;i++)
        {
            gradesArray[i]=s.nextInt();
        }



        StudentClass student=new StudentClass();
        student.findAverage(numberOfStudents,i,gradesArray);
        student.findMaximum(numberOfStudents,i,gradesArray);
        student.findMinimum(numberOfStudents,i,gradesArray);

    }


    public void findAverage(int numberOfStudents,int i,int gradesArray[])    {
        int sum=0;
        float average;
        for(i=0;i<numberOfStudents;i++)
        {
            sum=sum+gradesArray[i];
        }
        average=sum/numberOfStudents;
        System.out.println("The average is "+average);
    }

    public void findMaximum(int numberOfStudents,int i,int gradesArray[])    {
        int max=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(max<gradesArray[i])
            {
                max=gradesArray[i];
            }
        }

        System.out.println("The maximum grade is "+max);
    }

    public void findMinimum(int numberOfStudents,int i,int gradesArray[])    {
        int min=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(min>gradesArray[i])
            {
                min=gradesArray[i];
            }
        }

        System.out.println("The minimum grade is "+min);
    }


}
