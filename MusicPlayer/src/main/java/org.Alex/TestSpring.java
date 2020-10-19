//https://www.youtube.com/watch?v=Ns0IxBXDbWw&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=4
package org.Alex;

import com.sun.deploy.net.MessageHeader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean bool = firstMusicPlayer==secondMusicPlayer;
        System.out.println(bool);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        //task for homework
       //musicPlayer.playMusic();
       context.close();

    }
}
