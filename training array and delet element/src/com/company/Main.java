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
            System.out.println("Задать число самомтоятельно?");
            System.out.println("1.Да.");
            System.out.println("2.Нет.");
            Scanner sc3 = new Scanner(System.in);
            int ynNum = sc3.nextInt();
            switch (ynNum){
                case(1):
                    System.out.println("Введите ЗАДАННОЕ число (заданное число должно содержаться в массиве): ");
                    i = sc3.nextInt();
                    int n2 = 0;
                    for (int u = 0; u < myArray.length ; u++) {
                        if(myArray[u] == i){
                    n2 ++;
                        }
                    }
                    if(n2 > 0){
                        n = 1;
                    }
                    else{
                        System.out.println("Заданное число не подходит");
                    }
                    break;
                case (2):
                    System.out.println("Завершение программы.");
                    break;
            }

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
                int myArrnum =0;
                for (int m = 0; m < myArray.length ; m++) {
                        if(myArray[m] != i){
                            myArray2[myArrnum] = myArray[m];
                            myArrnum++;
                    }
                }
                System.out.println("Количество элементов в массиве после удаление заданного элемента - " + myArray2.length );
                System.out.println("Массив после удаления заданного числа :");
                for (int e = 0; e < myArray2.length ; e++) {
                    System.out.print(myArray2[e] + " ");
                }
                break;

            case (2):
                System.out.println("Как изменить задданое число");
                System.out.println("1.Умножить на ЧИСЛО Z.");
                System.out.println("2.Разделить на ЧИСЛО Z.");
                System.out.println("3.Суммировать с ЧИСЛОМ Z.");
                System.out.println("4.Вычесть из заданного числа Число Z.");
                Scanner sc2 = new Scanner(System.in);
                int menu2 = sc2.nextInt();
                System.out.println("Введите ЧИСЛО Z : ");
                int numZ = sc2.nextInt();
                switch (menu2){
                    case(1):
                        int [] myArray3 = new int[myArray.length];
                        int myArrnum1 =0;
                        for (int m = 0; m < myArray.length ; m++) {
                            if(myArray[m] != i){
                                myArray3[myArrnum1] = myArray[m];
                                myArrnum1++;
                            }
                            else{
                                int t = i*numZ;
                                myArray3[myArrnum1] = t;
                                myArrnum1++;
                            }
                        }

                        System.out.println("Массив после изменения заданного числа :");
                        for (int e = 0; e < myArray3.length ; e++) {
                            System.out.print(myArray3[e] + " ");
                        }
                        break;
                    case(2):
                        int [] myArray4 = new int[myArray.length];
                        int myArrnum2 =0;
                        for (int m = 0; m < myArray.length ; m++) {
                            if(myArray[m] != i){
                                myArray4[myArrnum2] = myArray[m];
                                myArrnum2++;
                            }
                            else{
                                int t = i/numZ;
                                myArray4[myArrnum2] = t;
                                myArrnum2++;
                            }
                        }

                        System.out.println("Массив после изменения заданного числа :");
                        for (int e = 0; e < myArray4.length ; e++) {
                            System.out.print(myArray4[e] + " ");
                        }
                        break;
                    case(3):
                        int [] myArray5 = new int[myArray.length];
                        int myArrnum3 =0;
                        for (int m = 0; m < myArray.length ; m++) {
                            if(myArray[m] != i){
                                myArray5[myArrnum3] = myArray[m];
                                myArrnum3++;
                            }
                            else{
                                int t = i+numZ;
                                myArray5[myArrnum3] = t;
                                myArrnum3++;
                            }
                        }

                        System.out.println("Массив после изменения заданного числа :");
                        for (int e = 0; e < myArray5.length ; e++) {
                            System.out.print(myArray5[e] + " ");
                        }
                        break;
                    case (4):
                        int [] myArray6 = new int[myArray.length];
                        int myArrnum4 =0;
                        for (int m = 0; m < myArray.length ; m++) {
                            if(myArray[m] != i){
                                myArray6[myArrnum4] = myArray[m];
                                myArrnum4++;
                            }
                            else{
                                int t = i - numZ;
                                myArray6[myArrnum4] = t;
                                myArrnum4++;
                            }
                        }

                        System.out.println("Массив после изменения заданного числа :");
                        for (int e = 0; e < myArray6.length ; e++) {
                            System.out.print(myArray6[e] + " ");
                        }
                        break;
                    default:
                        System.out.println("Неккоректный ввод!");
                        break;

                }

                break;

                case (3):
                    System.out.println("Завершение программы.");
                break;
            default:
                System.out.println("Некорректный ввод");
        }


    }}
}
