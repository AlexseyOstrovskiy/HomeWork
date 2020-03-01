<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList ();

       list.add(2);
       list.add(4);
       list.add(6);
       list.add(8);
        list.print();

        System.out.println("**************");

        try {
            list.remove(2);
        }
        catch (MyException myException){
            System.out.println( myException.getMessage());
        }

        list.print();
        System.out.println("**************");

        try {
            System.out.println(list.get(3));
        }
        catch (MyException myException){
            System.out.println( myException.getMessage());
        }
        System.out.println("**************");

    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList ();

       list.add(2);
       list.add(4);
       list.add(6);
       list.add(8);
        list.print();

        System.out.println("**************");

        try {
            list.remove(2);
        }
        catch (MyException myException){
            System.out.println( myException.getMessage());
        }

        list.print();
        System.out.println("**************");

        try {
            System.out.println(list.get(3));
        }
        catch (MyException myException){
            System.out.println( myException.getMessage());
        }
        System.out.println("**************");

    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
