package org.alphacat.designpattern.structure.adapter;

public class AudioPlayer implements IMediaPlayer {

    private AdvancedAdapter advancedAdapter = new AdvancedAdapter();

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if ("vlc".equals(audioType)) {
            advancedAdapter.play(audioType, fileName);
        } else if ("mp4".equals(audioType)) {
            advancedAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
