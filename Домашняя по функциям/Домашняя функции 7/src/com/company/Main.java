<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int x=777;
        System.out.print(sumDigits(x));

    }
    public static int sumDigits(int x){
        int sum=0;
        int y;
        while (x>0){
            y=x%10;
            sum=sum+y;
            x=x/10;
        }
        return sum;
    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int x=777;
        System.out.print(sumDigits(x));

    }
    public static int sumDigits(int x){
        int sum=0;
        int y;
        while (x>0){
            y=x%10;
            sum=sum+y;
            x=x/10;
        }
        return sum;
    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
