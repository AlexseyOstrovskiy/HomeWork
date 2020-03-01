<<<<<<< HEAD
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int arr [][]={{9,-5,6,-9,88,-15},{8,1,-4}};
		System.out.print(Arrays.deepToString(replaceNegatives(arr)));
        }


    public static int[][] replaceNegatives(int arr[][]){
    	int arr1[][]=new int[2][];
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if (arr[i][j]<0){
					arr[i][j]=0;
				}
			}
		}
		return arr;
	}
}
=======
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	int arr [][]={{9,-5,6,-9,88,-15},{8,1,-4}};
		System.out.print(Arrays.deepToString(replaceNegatives(arr)));
        }


    public static int[][] replaceNegatives(int arr[][]){
    	int arr1[][]=new int[2][];
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if (arr[i][j]<0){
					arr[i][j]=0;
				}
			}
		}
		return arr;
	}
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
