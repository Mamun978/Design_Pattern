package AdapterPattern;

public class AudioPlayerAdapter implements  IVideoPlayer{

    public IAudioPlayer media;

    public AudioPlayerAdapter(){
        media=new Mp3Player();
    }
    @Override
    public void playVideo(String fileName) {
        System.out.println("generate some random patterns");
    }

    @Override
    public void playAudio(String fileName) {
        media.play("",fileName);
    }
}
