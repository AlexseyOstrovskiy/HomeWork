package com.company;

import java.util.ArrayList;

public class Buyer extends Thread {

    static ArrayList bigTurn = new ArrayList();
    static ArrayList littleTurn = new ArrayList();
    static ArrayList <String> notHappy = new ArrayList(); // список несчасливых покупателей
    static ArrayList <String> Happy  = new ArrayList();
    int nameBuyer;
    Buyer(int nameBuyer){
        this.nameBuyer = nameBuyer;
    }
    @Override
    public synchronized void run(){
        Thread Buyer = Thread.currentThread();
        try {
            sleep(1000);// Покупатель ждёт 1000мс
            notHappy.add(Buyer.getName());
            littleTurn.remove(Buyer.getName());
            System.out.println(Buyer.getName() + " я недоволен"); // Если ничего не происходит уходит из магазина
        } catch (InterruptedException e) {
            System.out.println(Buyer.getName() + " Я нашёл всё что нужно.");
        }}}


