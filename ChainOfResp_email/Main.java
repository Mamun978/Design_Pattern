package Email;

public class Main {
    public static void main(String[] args) {
        Email a=new Email(121,"Email 121 is processed by Captain",Priority.Low);
        Email b=new Email(123,"Email 123 is processed by  couch",Priority.Medium);
        Email c=new Email(125,"Email 125 is processed by board",Priority.High);
       

         Chain one=new CaptainEmailProcessor();
        Chain two=new CoachEmailProcessor();
         Chain three=new BoardEmailProcessor();

       one.setNext(two);
       two.setNext(three);
      
      one.process(a);
      one.process(b);
      one.process(c);

      // two.process(a);
      // two.process(b);
      // two.process(c);
     
      
      
     

    }
}
