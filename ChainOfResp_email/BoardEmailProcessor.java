package ChainOfResp_email;

public class BoardEmailProcessor implements EmailProcessor {
    private EmailProcessor nextEmailProcessor;
    @Override
    public void setNext(EmailProcessor nextEmailProcessor) {
        this.nextEmailProcessor = nextEmailProcessor;
        
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
