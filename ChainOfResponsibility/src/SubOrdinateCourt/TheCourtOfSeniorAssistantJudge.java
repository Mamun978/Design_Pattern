package SubOrdinateCourt;

public class TheCourtOfSeniorAssistantJudge implements Chain {
    private Chain nextChain;

     
    @Override
    public void setNext(Chain nextChain) {
      this.nextChain=nextChain;
        
    }

    @Override
    public void process(int request ) {
        if(request>150000 && request<=250000){
           System.out.println(+request+" Taka under the Jurisdiction of senior assistant judge ");

        }
        else{
            nextChain.process(request);
        }
   
    }
}
