package org.Alex;

import org.springframework.stereotype.Component;


public class RockMusic implements Music {
    public RockMusic() {
    }
    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    public void someInit(){
        System.out.println("I am init now!!!");
    }

    public void someDestroy(){
        System.out.println("i am Destroy now!");
    }
    @Override
    public String getSong() {
        return "Some ROCK song";
    }
}
