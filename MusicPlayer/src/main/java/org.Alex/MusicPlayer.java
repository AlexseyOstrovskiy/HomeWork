package org.Alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

//    private List<Music>musics;
//    public  MusicPlayer(List<Music>musics){
//    this.musics= musics;
//    }
//

    private List<Music>musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }




    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public  MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//           "applicationContext.xml"
//   );
//        musicList.add(context.getBean("musicBeanRock", RockMusic.class));
//        musicList.add(context.getBean("musicBeanClassic", ClassicalMusic.class));
//        musicList.add(context.getBean("musicBeanRap", RapMusic.class));
//
//        for (int i = 0; i <musicList.size() ; i++) {
//        System.out.println("Now play " +musicList.get(i).getSong());
//        }
//
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
            ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
            RapMusic rapMusic = context.getBean("musicBeanRap", RapMusic.class);
            RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
            musicList.add( classicalMusic);
            musicList.add(rockMusic);
            musicList.add(rapMusic);

        for (int i = 0; i <musicList.size() ; i++) {
            System.out.println(musicList.get(i).getSong());
        }
        System.out.println("Volume " + getVolume());
        System.out.println("Name this player " + getName());
       //System.out.println(musicList.size());

//        System.out.println(music.getSong());

    }
}
