public class SetTopBoxOn implements Command {

    SetTopBox setTopBox;

    SetTopBoxOn(SetTopBox setTopBox){
        this.setTopBox=setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.on();
        setTopBox.setChannel(12);
        setTopBox.setVolume(40);
    }
}
