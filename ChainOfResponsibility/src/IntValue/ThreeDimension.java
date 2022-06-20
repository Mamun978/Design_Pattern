package IntValue;

import java.util.Arrays;

public class ThreeDimension implements Chain{
    protected Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
          this.nextChain=nextChain;
    }

    @Override
    public void process(Dimension request) {
      if(request.getCoordinate().length==3){
          System.out.println("Three DImension coordinate : "+ Arrays.toString(request.getCoordinate()));
      }
    }
}
