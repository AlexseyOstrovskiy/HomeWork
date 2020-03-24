package com.company;

public class Buyer extends Thread {
    @Override
    public void run(){
        try {
            sleep(1000);// Покупатель ждёт 1000мс
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("я недоволен"); // Если ничего не происходит уходит из магазина


    }

}
