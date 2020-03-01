<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr;
        arr= new int[]{2,1,5};
        int result1 = average(arr);
        System.out.print("Среднее значение массива arr[] равно ");
        System.out.println(result1);
    }
    public static int average (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        int result = sum / arr.length;
        return result;

    }
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr;
        arr= new int[]{2,1,5};
        int result1 = average(arr);
        System.out.print("Среднее значение массива arr[] равно ");
        System.out.println(result1);
    }
    public static int average (int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        int result = sum / arr.length;
        return result;

    }
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
}