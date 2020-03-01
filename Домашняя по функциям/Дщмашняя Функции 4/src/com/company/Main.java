<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {

        int a = byteConverter(1, "kb"  );
    }


        public static int byteConverter (int m, String type) {
        String type1=type;
        int result=0;
            switch (type1) {
                case "b":
                    result = m * 1048576;
                    System.out.print(m);
                    System.out.print(" мегабайт = ");
                    System.out.print(result);
                    System.out.print(" байт");
                    break;
                case "kb":
                    result = m * 1024;
                    System.out.print(m);
                    System.out.print(" мегабайт = ");
                    System.out.print(result);
                    System.out.print(" килобайт");
                    break;
                default:
                    System.out.println("Неверно указаны параметры");
            }
       return result;
        }
=======
package com.company;

public class Main {

    public static void main(String[] args) {

        int a = byteConverter(1, "kb"  );
    }


        public static int byteConverter (int m, String type) {
        String type1=type;
        int result=0;
            switch (type1) {
                case "b":
                    result = m * 1048576;
                    System.out.print(m);
                    System.out.print(" мегабайт = ");
                    System.out.print(result);
                    System.out.print(" байт");
                    break;
                case "kb":
                    result = m * 1024;
                    System.out.print(m);
                    System.out.print(" мегабайт = ");
                    System.out.print(result);
                    System.out.print(" килобайт");
                    break;
                default:
                    System.out.println("Неверно указаны параметры");
            }
       return result;
        }
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
}