package com.bridgelabz.Day6;

import java.util.Scanner;

//4.Reverse a number using loop
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse:");
        int number = sc.nextInt();
        int reminder = 0;
        int result = 0;
        System.out.println("Original number : " +number);

        while(number != 0 ){
            reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }

        System.out.println("Reversed number : " +result);


    }
}
