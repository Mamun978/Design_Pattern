package IntValue;

import java.util.Arrays;

public class TwoDimension implements Chain{
    protected  Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
             this.nextChain=nextChain;
    }

    @Override
    public void process(Dimension request) {
          if(request.getCoordinate().length==2){
              System.out.println("Two Dimension coordinate : "+ Arrays.toString(request.getCoordinate()));
          }
          else{
              nextChain.process(request);
          }
    }
}
