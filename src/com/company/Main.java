package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your number");
        int yourNumber = keyboard.nextInt();  //declare new variable, "yourNumber" to capture keyboard entry
        int Result = divideByFive(yourNumber); //call your method "divideByFive with Parameter

        System.out.println("Result is " + Result);

    }

    public static int divideByFive(int yourNumber) {

        //formula
        int Result = yourNumber/5;
        return Result;
    }
    }
