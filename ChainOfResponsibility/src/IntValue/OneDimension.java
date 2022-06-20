package IntValue;

import java.util.Arrays;

public class OneDimension implements Chain{
    protected Chain nextChain;
    @Override
    public void setNext(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void process(Dimension request) {
        if(request.getCoordinate().length==1){
            System.out.println("OneDimension value is : "+ Arrays.toString(request.getCoordinate()));

        }
        else {
            nextChain.process(request);
        }
    }
}
