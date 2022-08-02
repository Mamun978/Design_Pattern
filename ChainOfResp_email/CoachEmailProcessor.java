package ChainOfResp_email;

public class CoachEmailProcessor implements EmailProcessor{
    private EmailProcessor nextEmailProcessor;

    public CoachEmailProcessor(BoardEmailProcessor boardEmailProcessor) {
        this.nextEmailProcessor=boardEmailProcessor;
    }

    public CoachEmailProcessor() {

    }

    @Override
    public void setNext(EmailProcessor nextEmailProcessor) {
        this.nextEmailProcessor = nextEmailProcessor;
        
    }

    @Override
    public void process(Email email) {
      if(email.getPriority()==Priority.Medium){
          System.out.println(email.getMesssage());
      }
      else if(this.nextEmailProcessor ==null){
          this.message();
      }
      else{
          nextEmailProcessor.process(email);
      }
    }

    @Override
    public void message() {
       System.out.println("Email# is not processed ");
        
    }
}
