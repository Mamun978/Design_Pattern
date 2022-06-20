package AC;

public class Remote {
    private Command c;
    public void setCommand(Command c){
        this.c=c;
    }
    public void run(){
        c.executeCommand();
    }
}
