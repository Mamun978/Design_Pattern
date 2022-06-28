package Email;

public class CaptainEmailProcessor implements EmailProcessor,Chain {
    private Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
        this.nextChain=nextChain;
        
    }

    @Override
    public void process(Email email) {
      if(email.getPriority()==Priority.Low){
          System.out.println(email.getMesssage());
      }
      else if(this.nextChain==null){
         this.message();
      }
      else{
        this.nextChain.process(email);
      }
    }
    @Override
    public void message() {
       System.out.println("Email# is not processed ");
        
    }

  
}
