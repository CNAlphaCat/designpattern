package org.alphacat.designpattern.structure.adapter;

public class VlcPlayer implements IVlcMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
