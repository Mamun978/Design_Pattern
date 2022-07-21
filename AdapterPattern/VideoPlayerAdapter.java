package AdapterPattern;

public class VideoPlayerAdapter implements IAudioPlayer{

    public IVideoPlayer media;

    public VideoPlayerAdapter(String type){
        media=VideoPlayerFactory.getVideoPlayer(type);
    }

    @Override
    public void play(String type, String filename) {
        System.out.println("You can write method body in your own way");
        media.playAudio(filename);
    }
}
