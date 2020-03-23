package com.company;

public class Buyer extends Thread {
    @Override
    public void run(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
