package com.company;

public class Main {

    public static void main(String[] args) {
	int [] myArray;
	myArray =  new int [25];
        System.out.println(myArray.length);
        //System.out.println(myArray[1]);
        int k = 3;
        for (int i = 0; i <myArray.length ; i++) {
            myArray[i] = i + k;
            k+=i;
        }

        System.out.println("myArray");
        for (int i = 0; i <myArray.length ; i++) {
            System.out.println(i + "-----" + myArray[i]);

        }

      int [] myArraySecond;
      myArraySecond =new int[myArray.length];
      int number = myArray.length;
        for (int i = 0; i <myArray.length ; i++) {
            myArraySecond[i] = myArray[number-1];
            number = number -1;
        }

        System.out.println("Второй массив");
        for (int i = 0; i <myArraySecond.length ; i++) {
            System.out.println(i +"---" + myArraySecond[i]);
        }
        

    }
}
