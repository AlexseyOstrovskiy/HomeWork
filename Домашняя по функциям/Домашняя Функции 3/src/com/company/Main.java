<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 29, 16, 9};
        int result = firstEven(arr);
        System.out.print("Первый найденый чётный элемент из заданной последовательности = ");
        System.out.println(result);
    }

    public static int firstEven(int...arr) {
        int x = arr[0];
        int y;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            y = x % 2;
            if (y == 0) {
                result = x;
            } else {
                 x = arr[i + 1];
            }
        }
        return result;
    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9, 29, 16, 9};
        int result = firstEven(arr);
        System.out.print("Первый найденый чётный элемент из заданной последовательности = ");
        System.out.println(result);
    }

    public static int firstEven(int...arr) {
        int x = arr[0];
        int y;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            y = x % 2;
            if (y == 0) {
                result = x;
            } else {
                 x = arr[i + 1];
            }
        }
        return result;
    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
