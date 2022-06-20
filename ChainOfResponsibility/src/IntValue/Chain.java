package IntValue;

import java.awt.*;

public interface Chain {
    public void setNext(Chain nextChain);
    public void process(Dimension request);
}
