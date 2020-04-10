package com.company;

public class Main {

    public static void main(String[] args) {
	char a = 'a';
        System.out.println((int) a);
        System.out.println((char)98);

        String x = "100";
        byte x1 = Byte.parseByte(x);
        byte x11 = 12;
        byte x2 = (byte) (x1 - x11);
        System.out.println(x2);

    }
}
