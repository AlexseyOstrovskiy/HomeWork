//https://www.youtube.com/watch?v=Ns0IxBXDbWw&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=4
package org.Alex;

import com.sun.deploy.net.MessageHeader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class );
//        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);
//       musicPlayer.playMusic();
//
//       Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//
//       MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//       classicalMusicPlayer.playMusic();
//       context.close();



//<!--    Example init and destroy method in beans-->

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean bool = firstMusicPlayer==secondMusicPlayer;
//        System.out.println(bool);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        //task for homework
       //musicPlayer.playMusic();
       context.close();

    }
}
