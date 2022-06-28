package Email;

public class CoachEmailProcessor implements EmailProcessor,Chain {
    private Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
        this.nextChain=nextChain;
        
    }

    @Override
    public void process(Email email) {
      if(email.getPriority()==Priority.Medium){
          System.out.println(email.getMesssage());
      }
      else if(this.nextChain==null){
          this.message();
      }
      else{
          nextChain.process(email);
      }
    }

    @Override
    public void message() {
       System.out.println("Email# is not processed ");
        
    }
}
