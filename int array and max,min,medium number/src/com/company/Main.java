package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//создаём массив и заполняем случайными цифрами
       int [] arr = new int[20];
        Random random =new Random();
        for (int i = 0; i < 20 ; i++) {
            int a = random.nextInt(19);         //19
            arr[i] = a +1;                             //+1 для того что бы Random не давал 0
        }
        System.out.println("количество элементов в массиве = " + arr.length);
        System.out.println("Массив состоит из следующх чисел: " );
        for (int i = 0; i < arr.length; i++) {
        System.out.println( arr[i] );
        }



/*
//ищем минимальное значение
      int min = 21;
        for (int i = 0; i < arr.length -1 ; ) {
            if (arr[i] < arr[i]+1) {                //почему здесь arr[i]+1!!!!!!!!! смотреть ниже на вторую часть комента
                if (arr[i] < min) {
                   min = arr[i];
                }
                i++;
           }
        }
         if ( arr[arr.length -1]< min){
             min = arr[arr.length -1];
         }
        System.out.println("Минимальное число в масиве = " + min);




 //Ищем максимальное число



        /* тренировка
          int [] arr = new int[5];
        arr[0] = 4;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 5;
        arr[4] = 2;
        for (int i = 0; i < 2; ) {
        System.out.println("TEST " + arr[i+1]);
        i++;}



        int max = 0;
        for (int i = 0; i < arr.length -1 ; ) {
            if (arr[i] > arr[i + 1]) {             //а здесь так arr[i + 1] !!!!!!!!!! смотреть выше на первую часть комента
               if (arr[i] > max) {
                    max = arr[i];
               }
            }
            i++;
        }
        if ( arr[arr.length -1] > max){
            max = arr[arr.length -1];
        }
        System.out.println("Максимальное число в масиве = " + max);






// Среднее значение
        int sum = 0;
        for (int i = 0; i < arr.length  ; i++) {
             sum =sum + arr[i];
        }
        int medium = sum / arr.length;
        System.out.println("Среднее значение массива = " + medium);
        */

//метод с сортировкой массива
        System.out.println("************");
        Arrays.sort(arr);
      /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] );
        }
       */

        System.out.println("Минимальная цифра из массива = " + arr[0]);
        System.out.println("Максимальная цифпа из массива = " + arr[arr.length - 1]);
        int middle = arr.length % 2;
        if(middle == 0){
            int middleN1 = arr.length/2;
            int middleN2 = middleN1 + 1;
        System.out.println("Среднее значение массива, так как массив имеет четное количество элементов равное " + arr.length) ;
            System.out.println("в качестве среднего элемента будут выведены" + middleN1 + " " +  middleN2 + " элементы");
            System.out.println(middleN1 + " элемент равен = " + arr[middleN1]);
            System.out.println(middleN2 + " элемент равен = " + arr[middleN2]);
        }
        else{
            int middleN3 = (arr.length/2) +1 ;
            System.out.println("Среднее значение массива, так как массив имеет нечетное количество элементов равное " + arr.length);
            System.out.println("В качестве среднего значения будет " + middleN3 + " элемент, равный = " + arr[middleN3] );
        }
    }
}
