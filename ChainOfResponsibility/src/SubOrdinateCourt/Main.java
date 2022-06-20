package SubOrdinateCourt;

public class Main {
    
   public static void main(String[] args) {
    Chain c1=new TheCourtOfAssistantJudge();
    Chain c2=new TheCourtOfSeniorAssistantJudge();
    Chain c3=new TheCourtOfJointAssistantJudge();
   
     
    c1.setNext(c2);
    c2.setNext(c3);
    
    
    

     c1.process(160000);
     c1.process(260000);
     c1.process(13);

    

   }
}
