package com.stackroute.practice02;

public class PowerOfFour {
    public String powerOfFourCheck(int number)
    {
        if(number==0)               //if number inputted is 0
            return "The number is not a power of four";
      while(number!=1) {        //if the number is not equal to 1 then looping condition
          if (number % 4 != 0)
              return "The number is not a power of four";       //if the remainder is not 0, then it is not a power of four
          number = number / 4;
      }

      return "The number is a power of four";               //print statement if number is power of four

      }

    }

