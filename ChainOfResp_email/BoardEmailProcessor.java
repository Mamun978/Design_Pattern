package Email;

public class BoardEmailProcessor implements EmailProcessor,Chain{
    private Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
        this.nextChain=nextChain;
        
    }

    @Override
    public void process(Email email) {
      if(email!=null){
          System.out.println(email.getMesssage());
      }
      else{
        this.message();
      }
    }
    @Override
    public void message() {
       System.out.println("Email# is not processed");
        
    }
  
    
}
