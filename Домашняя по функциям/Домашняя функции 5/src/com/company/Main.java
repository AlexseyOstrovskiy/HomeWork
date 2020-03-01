<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, };
        arr = isSorted(arr);
    }

    public static int[] isSorted(int[] arr) {
       // Boolean result;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]>arr[i]){
           // for (int j = i + 1; j < arr.length; j++) {
                //if (arr[j] > arr[i]) {
                   Boolean result = true;
                    System.out.print(result);
                    break;
                } else {
                   Boolean result = false;
                    System.out.print(result);
                    break;
                }
            }
        return arr;
        }
    }

=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, };
        arr = isSorted(arr);
    }

    public static int[] isSorted(int[] arr) {
       // Boolean result;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i+1]>arr[i]){
           // for (int j = i + 1; j < arr.length; j++) {
                //if (arr[j] > arr[i]) {
                   Boolean result = true;
                    System.out.print(result);
                    break;
                } else {
                   Boolean result = false;
                    System.out.print(result);
                    break;
                }
            }
        return arr;
        }
    }

>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
