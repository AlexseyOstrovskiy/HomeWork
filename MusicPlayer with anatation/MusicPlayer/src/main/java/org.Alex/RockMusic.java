package org.Alex;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements Music {
    private RockMusic() {
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
