package ChainOfResp_email;

public class CaptainEmailProcessor implements EmailProcessor {
    private EmailProcessor nextEmailProcessor;

    public CaptainEmailProcessor(CoachEmailProcessor coachEmailProcessor) {
       this.nextEmailProcessor =coachEmailProcessor;
    }

    @Override
    public void setNext(EmailProcessor nextEmailProcessor) {
        this.nextEmailProcessor = nextEmailProcessor;
        
    }

    @Override
    public void process(Email email) {
      if(email.getPriority()==Priority.Low){
          System.out.println(email.getMesssage());
      }
      else if(this.nextEmailProcessor ==null){
         this.message();
      }
      else{
        this.nextEmailProcessor.process(email);
      }
    }
    @Override
    public void message() {
       System.out.println("Email# is not processed ");
        
    }

  
}
