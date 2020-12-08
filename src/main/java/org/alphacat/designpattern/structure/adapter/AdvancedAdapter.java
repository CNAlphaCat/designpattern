package org.alphacat.designpattern.structure.adapter;

public class AdvancedAdapter implements IMediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equals(audioType)) {
            IVlcMediaPlayer vlcPlayer = new VlcPlayer();
            vlcPlayer.playVlc(fileName);
        } else if ("mp4".equals(audioType)) {
            IMp4MediaPlayer mp4Player = new Mp4Player();
            mp4Player.playMp4(fileName);
        }
    }
}
