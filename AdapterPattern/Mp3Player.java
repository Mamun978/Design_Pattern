package AdapterPattern;

public class Mp3Player implements IAudioPlayer{
    @Override
    public void play(String type, String filename) {
        System.out.println("Playing Mp3 file "+filename);
    }
}
