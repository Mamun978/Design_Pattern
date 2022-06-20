public class TvOnCommand implements Command{
    Tv tv;
     TvOnCommand(Tv tv){
         this.tv=tv;
     }

    @Override
    public void execute() {
        tv.on();
    }
}
