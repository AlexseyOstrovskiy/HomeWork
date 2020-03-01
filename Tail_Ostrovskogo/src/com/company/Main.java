package com.company;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        //Files.lines(Paths.get("C:\\Users\\Asus\\Desktop\\Test.txt"), StandardCharsets.UTF_8).forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String way = sc.nextLine();
        Files.lines(Paths.get(way), StandardCharsets.UTF_8).forEach(System.out::println);



    }
}
