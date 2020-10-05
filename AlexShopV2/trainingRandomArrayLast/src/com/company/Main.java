package com.company;

public class Main {

    public static void main(String[] args) {
int array1[];
array1 = new int [12];
int array2[];
array2 =new int [12];
int mainArray[];
mainArray = new int [12];


        for (int i = 0; i <12 ; i++) {
            double a = (Math.random()*10)+1;
            int b = (int)a;
            array1[i] = b;
        }
        for (int i = 0; i <12 ; i++) {
            double a = (Math.random()*10)+1;
            int b = (int)a * (-1);
            array2[i] = b;
        }



        int countPlus=0;
        int countMinus=0;

        for (int i = 0; i <12 ; i++) {
            double chek = Math.random()*10;
            int plus = array1[i];
            int minus = array2[i];

            if(countPlus != 6 && countMinus != 6){

                    if((int) chek % 2 == 0){
                        mainArray [i] = plus;
                        countPlus = countPlus + 1;
                    }
                    else {
                        mainArray [i] =minus;
                        countMinus = countMinus + 1;
                    }
            }
            else if(countMinus  == 6){
                mainArray [i] = plus;
            }
            else if(countPlus == 6){
                mainArray [i] =minus;
            }
        }



        for (int i = 0; i <12 ; i++) {
            System.out.println(mainArray[i]);
        }

    }
}
