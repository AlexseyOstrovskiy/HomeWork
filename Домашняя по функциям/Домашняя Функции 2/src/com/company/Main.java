<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        double arr[] = {-5,0.99,64,1285,-568};
        double resul = min(arr);
        System.out.print("Минимальное число из чисел в массиве =  ");
         System.out.println(resul);
    }

    public static double min(double[] arr) {
        double arrmin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrmin)
                arrmin = arr[i];
            }
        return arrmin;
        }
    }

=======
package com.company;

public class Main {

    public static void main(String[] args) {
        double arr[] = {-5,0.99,64,1285,-568};
        double resul = min(arr);
        System.out.print("Минимальное число из чисел в массиве =  ");
         System.out.println(resul);
    }

    public static double min(double[] arr) {
        double arrmin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrmin)
                arrmin = arr[i];
            }
        return arrmin;
        }
    }

>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
