package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String way = sc.nextLine();
       /* Files.lines(Paths.get(way), StandardCharsets.UTF_8).forEach(System.out::println);
    }

   */

/*  try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    new FileInputStream(way), StandardCharsets.UTF_8))){
        String line;
        while ((line = reader.readLine()) != null) {
           // System.out.println(line);
            for (int i =0; true; i++){
            String [] Array = new String[50];
            Array [i] = line;
            System.out.println(Array[0]);
        }}
    } catch (IOException e) {
      System.out.println("Что то пошло не так");
    }

 */

       try (BufferedReader reader = new BufferedReader(
               new InputStreamReader(
                       new FileInputStream(way), StandardCharsets.UTF_8))){
           String line;
           while ((line = reader.readLine()) != null) {
               // System.out.println(line);
             // for (int i =0; ; i++){
                   LinkedList <String> List = new LinkedList<>();
                  List.add(line);
                  //C:\Users\Asus\Desktop\Test.txt
              // System.out.println(List.size());
                 //  System.out.println(List);
             //  for(int i = 0; i!=9; i++){
               //    int a = List.size();
                 //  System.out.println(List.get(a - i));
             //  }
              // }
               //List.toArray();

               System.out.println(List.get(0));
       }
       } catch (IOException e) {
           System.out.println("Что то пошло не так");

}
   }}
