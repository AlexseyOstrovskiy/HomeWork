package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

     /*  File fileForRead = new File("C://SomeDir//Test.txt"/*, "Test");
       // Files.lines(Paths.get(тест), StandardCharsets.UTF_8).forEach(System.out::println);
        System.out.println("File size: " + fileForRead.length());
        Files.lines(Paths.get(String.valueOf(fileForRead)), StandardCharsets.UTF_8).forEach(System.out::println);

      */

       /* String fileName = "Test.txt";
        Optional<String> line = Files.lines(Paths.get(fileName)).findFirst();
        System.out.println(line.get());

        */

      /*  BufferedReader br = new BufferedReader(new FileReader("C://SomeDir//Test.txt"));
        String s = br.readLine();
        System.out.println(s);
        br.close();

       */

        FileReader fr = new FileReader("C:\\Users\\Asus\\Desktop","Test.txt");
        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();



    }
}
