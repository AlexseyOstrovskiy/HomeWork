package com.company;

public class Main  {
    static Eggs mAnotherOpinion;
    public static void main(String[] args) {
        mAnotherOpinion = new Eggs();
        System.out.println("Спор начат");
        mAnotherOpinion.start();
        for (int i =0; i < 5; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("КУРИЦА");
        }

       /* if (mAnotherOpinion.isAlive()){
            try{mAnotherOpinion.join();}
            catch (InterruptedException e){}
            System.out.println("Egs");
        }
        else {
            System.out.println("Chiken");
        }
        System.out.println("Спор окончен");

        */


    }
}