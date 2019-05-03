package com.stackroute.practice02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//4. Write a program to read the content of a text file, convert the content in upper case
//and print the same in console along with the length of the file.
public class FileUpperCase {
    public static void main(String[] args) throws Exception{
        File file=new File("file.txt");
        Scanner s=new Scanner(file);    //reading the file
        String word=s.nextLine();
        String upperCaseWord=word.toUpperCase();        //converting to upper case
        int length=word.length();       //length of the string
        System.out.println(upperCaseWord);
        System.out.println(length);


    }
}


