package ChainOfResp_email;

public interface EmailProcessor {

    public void setNext(EmailProcessor nextEmailProcessor);
    public void process(Email email);

    public void message();

    
}