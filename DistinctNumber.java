package com.bridgelabz.Day6;

//5.distinct Coupon Numbers,
public class DistinctNumber {
    public static void main(String[] args) {
        int arrayData[] = new int[5];
        int index = 0; //arrayIndex
        int temp = 0; //exit variable for while
        int count = 0; //random Number count

        while(temp != -1) {
            int randomNumber = (int)(Math.random()*10)%9+1;
            System.out.println("randomNumber = " + randomNumber);
            count++;
            boolean flag = false;
            if (index == 0) {
                arrayData[index] = randomNumber;
                index++;
            } else {
                for (int i = 0; i < arrayData.length; i++) {
                    if (randomNumber == arrayData[i] && arrayData[i] != 0) {
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    arrayData[index] = randomNumber;
                    index++;
                }
                if (index == arrayData.length) {
                    temp = -1;
                    break;
                }
            }
        }
        for (int value:arrayData) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("total number of random numbers to get distinct Coupon :"+count);
    }
}
