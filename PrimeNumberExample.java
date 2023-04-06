package com.bridgelabz.Day6;

import java.util.Scanner;


//3.Prime number
public class PrimeNumberExample {
    static boolean checkForPrime(int data){
        int temp = data/2;
        boolean flag = false;

        if(data == 0 || data == 1){
            System.out.println(data + " is not counted as prime numbers");
        } else if (data == 2) {
            System.out.println(data + " is the only even prime number");
        }else {
            for (int i = 2; i < temp; i++) {
                if (data % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int data = sc.nextInt();

        boolean resultFlag = checkForPrime(data);
        if(resultFlag == false && data >= 3){
            System.out.println(data + " is prime number");
        }else{
            System.out.println(data + " not prime number");
        }
    }
}
