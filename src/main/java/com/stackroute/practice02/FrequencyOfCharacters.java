package com.stackroute.practice02;

import java.io.File;
import java.util.Scanner;


//9. Write a program to calculate the frequency of the words in a given file,Example: Create a file named FileDemo.txt with the following content
//i am a man , i like to sleep , i have a home.
//Output: i->3 times,
//am-1,
//like -1,
//have -1,
//a-2 etc.,
public class FrequencyOfCharacters {
    public static void main(String[] args) throws Exception {
        File file = new File("filedemo.txt");
        Scanner s = new Scanner(file);
        String sentence = s.nextLine();
        int count = 0;
        String[] words = sentence.split(" ");       //splitting sentence into word array
        String[] uniqueWords=getUniqueWords(words);

        for (String word : words) {
            if (word == null) {
                break;
            }
            for (String s1 : words) {
                if (word.equals(s1)) {      //if words are similar, increase count
                    count++;
                }
            }
            System.out.println("count of [" + word + "] is : " + count);
            count = 0;
        }

    }


   private static String[] getUniqueWords(String[] words)
    {
        String[] uniqueWords=new String[words.length];
        uniqueWords[0]=words[0];
        int uniqueWordIndex=1;
        boolean wordAlreadyExists=false;

        for(int i=1;i<words.length;i++)
        {
            for(int j=0;j<=uniqueWordIndex;j++)
            {
                if(words[i].equals(uniqueWords[j]))
                {
                    wordAlreadyExists=true;
                }
            }
            if(!wordAlreadyExists)
            {
               uniqueWords[uniqueWordIndex]=words[i];       //if word already exists then increase count
               uniqueWordIndex++;
            }
            wordAlreadyExists=false;
        }
        return uniqueWords;


    }
}


