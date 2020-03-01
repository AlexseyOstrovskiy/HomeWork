<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {

	double w=sqRoots(5,85,9);


    }

    public static double sqRoots(double a, double b, double c){
        double D;
        double x1;
        double x2;
        double z;

        if (a!=0 & b!=0 & c!=0) {
            D=(b*b) - (4*a*c);
            if (D<0){
                System.out.println("Корней нет");
            }
            else {
                x1=((-b)+Math.sqrt(D))/(2*a);
                x2=((-b)-Math.sqrt(D))/(2*a);
                System.out.print("Корень X1= ");
                System.out.println(x1);
                System.out.print("Корень X2= ");
                System.out.println(x2);
            }
        }
        if (a!=0 & b==0 & c==0){
            System.out.println("Единственный корень x=0");
        }
        if(a!=0 & b==0 & c!=0) {
            z=-(c/a);
            if(z<0){
                System.out.println("Корней нет");
            }
            else {
                x1=Math.sqrt(z);
                x2=-Math.sqrt(z);
                System.out.print("Корень X1= ");
                System.out.println(x1);
                System.out.print("Корень X2= ");
                System.out.println(x2);
            }
        }
        if (a!=0 & c==0 & b!=0){
            x1=0;
            x2=-(b/a);
            System.out.print("Корень X1= ");
            System.out.println(x1);
            System.out.print("Корень X2= ");
            System.out.println(x2);
        }
        if (a==0 & b!=0 & c!=0){
            System.out.print("Коэффициент при первом слагаемом не может быть равным нулю");
        }
        if (a==0 & b==0 & c==0){
            System.out.print("Неккоректное условие уравнения");
        }

        double w=0;
        return w;
    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {

	double w=sqRoots(5,85,9);


    }

    public static double sqRoots(double a, double b, double c){
        double D;
        double x1;
        double x2;
        double z;

        if (a!=0 & b!=0 & c!=0) {
            D=(b*b) - (4*a*c);
            if (D<0){
                System.out.println("Корней нет");
            }
            else {
                x1=((-b)+Math.sqrt(D))/(2*a);
                x2=((-b)-Math.sqrt(D))/(2*a);
                System.out.print("Корень X1= ");
                System.out.println(x1);
                System.out.print("Корень X2= ");
                System.out.println(x2);
            }
        }
        if (a!=0 & b==0 & c==0){
            System.out.println("Единственный корень x=0");
        }
        if(a!=0 & b==0 & c!=0) {
            z=-(c/a);
            if(z<0){
                System.out.println("Корней нет");
            }
            else {
                x1=Math.sqrt(z);
                x2=-Math.sqrt(z);
                System.out.print("Корень X1= ");
                System.out.println(x1);
                System.out.print("Корень X2= ");
                System.out.println(x2);
            }
        }
        if (a!=0 & c==0 & b!=0){
            x1=0;
            x2=-(b/a);
            System.out.print("Корень X1= ");
            System.out.println(x1);
            System.out.print("Корень X2= ");
            System.out.println(x2);
        }
        if (a==0 & b!=0 & c!=0){
            System.out.print("Коэффициент при первом слагаемом не может быть равным нулю");
        }
        if (a==0 & b==0 & c==0){
            System.out.print("Неккоректное условие уравнения");
        }

        double w=0;
        return w;
    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
