package com.company;

import java.util.Random;
import static com.company.Main.littleTurn;

public class Seller extends Thread {
    @Override
    public synchronized void run() {
        Thread Seller = Thread.currentThread();
        do {
            for (int j = 0; j < 5; j++) {
                try {
                    Random random = new Random();
                    int rNumber = random.nextInt(littleTurn.size() - 1);
                    Seller.sleep(30);
                    System.out.println("покупатель номер " + littleTurn.get(rNumber).getName() + " получил свой товар клас Seller");
                    littleTurn.get(rNumber).interrupt();
                    littleTurn.remove(rNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
                System.out.println("Я ухожу на склад, скоро вернусь!");
                try {
                    Seller.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
        while (!littleTurn.isEmpty());
    }
}