<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
		int s =51906;
		System.out.print(showTime(s));

    }

    public static int showTime (int s){
		int a=s/3600;
		if (a<10){
			System.out.print("0");
			System.out.print(a+":");}
		else System.out.print(a+":");
		int b=s%3600;
		int c=b/60;
		if (c<10){
			System.out.print("0");
			System.out.print(c+":");}
		else System.out.print(c+":");
		int d=b%60;
		if (d<10){
			System.out.print("0");}
		return d;

	}
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
		int s =51906;
		System.out.print(showTime(s));

    }

    public static int showTime (int s){
		int a=s/3600;
		if (a<10){
			System.out.print("0");
			System.out.print(a+":");}
		else System.out.print(a+":");
		int b=s%3600;
		int c=b/60;
		if (c<10){
			System.out.print("0");
			System.out.print(c+":");}
		else System.out.print(c+":");
		int d=b%60;
		if (d<10){
			System.out.print("0");}
		return d;

	}
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
