package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String way = sc.nextLine();
        Files.lines(Paths.get(way), StandardCharsets.UTF_8).forEach(System.out::println);
    }
}
