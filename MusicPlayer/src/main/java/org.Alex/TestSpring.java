//https://www.youtube.com/watch?v=Ns0IxBXDbWw&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=4
package org.Alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("musicBean", Music.class);
       MusicPlayer musicPlayer = new MusicPlayer(music);
       musicPlayer.playMusic();
       context.close();

    }
}
