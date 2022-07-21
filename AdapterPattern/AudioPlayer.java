package AdapterPattern;

public class AudioPlayer implements  IAudioPlayer{


    @Override
    public void play(String type, String filename) {

        if(type.equals("mp3")){
            new Mp3Player().play(type,filename);
        }
        else{
            IAudioPlayer media=new VideoPlayerAdapter(type);
                    media.play(type,filename);
        }
    }
}
