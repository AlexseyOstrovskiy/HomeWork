<<<<<<< HEAD
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Holt holt = new Holt(3000,1500, "марка Holt. Объём бака: для воды 3000млл, для кофе 1500гр");
    //Vitek vitek = new Vitek(1500,750, "марка Vitek. Объём бака: для воды 1500млл, для кофе 750гр");
    Scanner sc = new Scanner(System.in);
    System.out.println("Выберете марку кофемашины");
    System.out.println("1. Holt.");
    System.out.println("2. Vitek.");
    int  choice = Integer.parseInt(sc.nextLine());
    if ( choice==1 ){
        System.out.println("Вы выбрати Holt");
        Holt holt = new Holt(3000,1500, "марка Holt. Объём бака: для воды 3000млл, для кофе 1500гр.");
        while (true){
        System.out.println("1.Показать текущий объем воды и кофе.");
        System.out.println("2.Приготовить Американо. ");
        System.out.println("3.Приготовить Эспрессо.");
        System.out.println("4.Приготовить Двойной эспрессо.");
        System.out.println("5.Заполнить бак с водой.");
        System.out.println("6.Заполнить бак с кофе.");
        System.out.println("7. Информация.");
        System.out.println("8.Выключить кофемаштну.");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
              holt.checkWaterCoffe();
              break;
              //return;
            case 2:
                holt.makeAmericano();
                break;
            case 3:
                holt.makeEspresso();
                break;
            case 4:
                holt.makeWEspresso();
                break;
            case 5:
                holt.replenishWater();
                break;
            case 6:
                holt.replenishCoffe();
                break;
            case 7:
                holt.information();
                break;
            case 8:
                holt.deactivate();
                return;
            default:
                System.out.println("Выбирете из предложенных пунктов меню.");
                break;
        }
        }

    }
     else if (choice==2){
        System.out.println("Вы выбрати Vitek");
        Vitek vitek = new Vitek(1500,750, "марка Vitek. Объём бака: для воды 1500 млл, для кофе 750гр.");
        while (true){
            System.out.println("1.Показать текущий объем воды и кофе.");
            System.out.println("2.Приготовить Американо. ");
            System.out.println("3.Приготовить Эспрессо.");
            System.out.println("4.Приготовить Двойной эспрессо.");
            System.out.println("5.Заполнить бак с водой.");
            System.out.println("6.Заполнить бак с кофе.");
            System.out.println("7. Информация.");
            System.out.println("8.Выключить кофемаштну.");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    vitek.checkWaterCoffe();
                    break;
                //return;
                case 2:
                    vitek.makeAmericano();
                    break;
                case 3:
                    vitek.makeEspresso();
                    break;
                case 4:
                    vitek.makeWEspresso();
                    break;
                case 5:
                    vitek.replenishWater();
                    break;
                case 6:
                    vitek.replenishCoffe();
                    break;
                case 7:
                    vitek.information();
                    break;
                case 8:
                    vitek.deactivate();
                    return;
                default:
                    System.out.println("Выбирете из предложенных пунктов меню.");
                    break;
            }
        }

    }
     else {
         System.out.println("Выбор не корректный");
    }



    }
}
=======
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Holt holt = new Holt(3000,1500, "марка Holt. Объём бака: для воды 3000млл, для кофе 1500гр");
    //Vitek vitek = new Vitek(1500,750, "марка Vitek. Объём бака: для воды 1500млл, для кофе 750гр");
    Scanner sc = new Scanner(System.in);
    System.out.println("Выберете марку кофемашины");
    System.out.println("1. Holt.");
    System.out.println("2. Vitek.");
    int  choice = Integer.parseInt(sc.nextLine());
    if ( choice==1 ){
        System.out.println("Вы выбрати Holt");
        Holt holt = new Holt(3000,1500, "марка Holt. Объём бака: для воды 3000млл, для кофе 1500гр.");
        while (true){
        System.out.println("1.Показать текущий объем воды и кофе.");
        System.out.println("2.Приготовить Американо. ");
        System.out.println("3.Приготовить Эспрессо.");
        System.out.println("4.Приготовить Двойной эспрессо.");
        System.out.println("5.Заполнить бак с водой.");
        System.out.println("6.Заполнить бак с кофе.");
        System.out.println("7. Информация.");
        System.out.println("8.Выключить кофемаштну.");
        int menu = sc.nextInt();
        switch (menu){
            case 1:
              holt.checkWaterCoffe();
              break;
              //return;
            case 2:
                holt.makeAmericano();
                break;
            case 3:
                holt.makeEspresso();
                break;
            case 4:
                holt.makeWEspresso();
                break;
            case 5:
                holt.replenishWater();
                break;
            case 6:
                holt.replenishCoffe();
                break;
            case 7:
                holt.information();
                break;
            case 8:
                holt.deactivate();
                return;
            default:
                System.out.println("Выбирете из предложенных пунктов меню.");
                break;
        }
        }

    }
     else if (choice==2){
        System.out.println("Вы выбрати Vitek");
        Vitek vitek = new Vitek(1500,750, "марка Vitek. Объём бака: для воды 1500 млл, для кофе 750гр.");
        while (true){
            System.out.println("1.Показать текущий объем воды и кофе.");
            System.out.println("2.Приготовить Американо. ");
            System.out.println("3.Приготовить Эспрессо.");
            System.out.println("4.Приготовить Двойной эспрессо.");
            System.out.println("5.Заполнить бак с водой.");
            System.out.println("6.Заполнить бак с кофе.");
            System.out.println("7. Информация.");
            System.out.println("8.Выключить кофемаштну.");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    vitek.checkWaterCoffe();
                    break;
                //return;
                case 2:
                    vitek.makeAmericano();
                    break;
                case 3:
                    vitek.makeEspresso();
                    break;
                case 4:
                    vitek.makeWEspresso();
                    break;
                case 5:
                    vitek.replenishWater();
                    break;
                case 6:
                    vitek.replenishCoffe();
                    break;
                case 7:
                    vitek.information();
                    break;
                case 8:
                    vitek.deactivate();
                    return;
                default:
                    System.out.println("Выбирете из предложенных пунктов меню.");
                    break;
            }
        }

    }
     else {
         System.out.println("Выбор не корректный");
    }



    }
}
>>>>>>> 1900b1d3fd7904182b106713e6023eaa98f2f4da
