package SubOrdinateCourt;

public class TheCourtOfAssistantJudge implements Chain {

    private Chain nextChain;

     
    @Override
    public void setNext(Chain nextChain) {
      this.nextChain=nextChain;
        
    }

    @Override
    public void process(int request ) {
        if(request<=150000){
           System.out.println(+request+" Taka under the Jurisdiction of assistant judge ");

        }
        else{
            nextChain.process(request);
        }
        
    }
    
}
