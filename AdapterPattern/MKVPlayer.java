package AdapterPattern;

public class MKVPlayer implements  IVideoPlayer{
    @Override
    public void playVideo(String fileName) {
        System.out.println("Decoding "+fileName+" file using MKV Player");

    }

    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing audio from MKV file "+fileName);
    }
}
