public class User {
    public static void main(String[] args) {
        Remote remote=new Remote();

        SetTopBox setTopBox=new SetTopBox();

        Tv tv=new Tv();


        remote.setCommand(new SetTopBoxOn(setTopBox));
        remote.pressButton();
        remote.setCommand(new TvOnCommand(tv));
        remote.pressButton();
        remote.setCommand(new TvOffCommand(tv));
        remote.pressButton();
        remote.setCommand(new SetTopBoxOff(setTopBox));
        remote.pressButton();


    }
}
