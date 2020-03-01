<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int x=17;
        System.out.print(isPrime(x));

    }
    public static Boolean isPrime(int x){
        for(int i=2; i<x; i++){
            if (x%i ==0){
                return false;
            }
        }
        return true;
    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int x=17;
        System.out.print(isPrime(x));

    }
    public static Boolean isPrime(int x){
        for(int i=2; i<x; i++){
            if (x%i ==0){
                return false;
            }
        }
        return true;
    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
