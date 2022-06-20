public class TvOffCommand implements Command {
    Tv tv;
    TvOffCommand(Tv tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
