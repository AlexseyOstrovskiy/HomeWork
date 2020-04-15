package com.company;
import static com.company.Main.littleTurn;
public class addBuyerInTurn extends Thread {
    Thread addbuyerInTurn = new Thread(new Runnable() {
        @Override
        public synchronized void run() {                //2 вариант здесь - не работает пока что
            for (int i = 0; i < 100; ) {
                if(littleTurn.size()< 20){
                    Buyer buyer = new Buyer(i);
                    littleTurn.add(buyer);
                    buyer.start();
                    i++;
                    System.out.println("************" + littleTurn.size());
                }
                else{
                    try {
                        Thread.sleep(0,1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    });
}
