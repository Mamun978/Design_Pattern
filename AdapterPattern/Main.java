package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer ap=new AudioPlayer();
        ap.play("mp3","Kabhi jo badal.mp3");
        System.out.println("----");

        ap.play("mkv", "xyz.mkv");

        System.out.println("----");

        ap.play("mp4","abc.mp4");



    }

}
