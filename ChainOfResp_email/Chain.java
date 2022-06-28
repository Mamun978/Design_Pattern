package Email;

public interface Chain {

    public void setNext(Chain nextChain);
    public void process(Email email);

    
}