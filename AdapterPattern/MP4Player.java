package AdapterPattern;

public class MP4Player implements IVideoPlayer{
    @Override
    public void playVideo(String fileName) {
        System.out.println("Decoding "+fileName+" file using MP4 Player");

    }

    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing audio from MP4 file "+fileName);
    }
}
