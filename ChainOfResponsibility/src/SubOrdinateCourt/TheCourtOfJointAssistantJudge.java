package SubOrdinateCourt;

public class TheCourtOfJointAssistantJudge implements Chain {

    private Chain nextChain;

     
    @Override
    public void setNext(Chain nextChain) {
      this.nextChain=nextChain;
        
    }
    @Override
    public void process(int request ) {
        if(request>250000 &&request<=50000000){
           System.out.println(+request+" Taka under the Jurisdiction of joint assistant judge ");

        }
       
        
    }
}
