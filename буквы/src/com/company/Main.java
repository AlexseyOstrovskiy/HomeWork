package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "sdadfsfafdfsfafrgsvasddsa";
        String [] arr = s.split("");
        String[] arr2 = new String[arr.length];
        for (int k = 0; k < arr.length ; ) {
            int j =0;
            String a = arr[k];
            for (int l = 0; l < arr2.length; l++) {
            if(!arr[k].equals(arr2[l])){
                if( arr[l].equals(a)){
                    j++;
                    arr2[l] = arr[l];
                }
            }}
            if(j != 0){
            System.out.println( arr[k] +" " + j + " раз");}
            k++;}
    }
    }

