package com.company;

public class Main {

    public static void main(String[] args) {
	String s = "sdssdaasddsa";
	String[] arr = s.split("");
        System.out.println(arr.length);
        System.out.println(arr[0]);

       
       
       


        for (int k = 0; k < arr.length ; ) {
            int j =0;
            String a = arr[k];
        for (int i = 0 ; i < arr.length ; i++) {
           if( arr[i].equals(a)){
            j++;
           }
        }
            System.out.println( arr[k] +" " + j + " раз");
        k++;}
        }
    }

