package com.company;

import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random =new Random();
        int i = random.nextInt(50);
        System.out.println("Заданное рандомное число : ");
        System.out.println(i);
        System.out.println("Массив будет состоять из ");
        int j = random.nextInt(30);
        System.out.print(j + " элементов");
        System.out.println(" ");
	    int[] myArray = new int[j];
        for (int k = 0; k < j ; k++) {
            myArray[k] = random.nextInt(50);
        }
        System.out.println("Первоначальный массив состоящий из " + j + " элементов : ");
        for (int l = 0; l < myArray.length ; l++) {
            System.out.print(myArray[l] + " ");
        }
        System.out.println(" ");

        int n = -1;
        for (int m = 0; m < myArray.length ; m++) {
            if(myArray[m] == i){
               n = m;
               System.out.println("число " + i + " находится в ячейке с ндексом " + m + " исходного массива");
            }
        }
        if(n == -1){
            System.out.println("Заданного числа в исходном массиве не найдено!");
        }

        if(n != -1){
        System.out.println("Что сделать с заданным числом : ");
        System.out.println("1.Удалить ");
        System.out.println("2.Изменить ");
        System.out.println("3.Ничего не делать, завершить программу. ");

        Scanner sc = new Scanner(System.in);

        int menu  = sc.nextInt();

        switch (menu){
            case(1):
                int q = 0;
                for (int m = 0; m < myArray.length ; m++) {
                    if(myArray[m] == i){
                        q++;
                    }
                }
                int [] myArray2 = new int[myArray.length - q];
                for (int m = 0; m < myArray.length ; m++) {
                    for (int w = 0; w < myArray.length - q ; w++) {
                        if(myArray[m] != i){
                            myArray2[w] = myArray[m];
                        }
                    }
                }
                System.out.println("Массив после удаления заданного числа :");
                for (int e = 0; e < myArray2.length ; e++) {
                    System.out.print(myArray2[e] + " ");
                    System.out.println(" ");
                }
                break;
        }


    }}
}
