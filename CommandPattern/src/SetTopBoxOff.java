public class SetTopBoxOff implements Command {
    SetTopBox setTopBox;

    SetTopBoxOff(SetTopBox setTopBox){
        this.setTopBox=setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }
}
