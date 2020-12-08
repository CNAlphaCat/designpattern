package org.alphacat.designpattern.structure.adapter;

public class Mp4Player implements IMp4MediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
