package simple_text;

public class MementoDemo {
    
    public static void main(String[] args) {
        
    Originator or=new Originator();

    CareTaker cr=new CareTaker();

    or.setState("State 1");

    or.setState("State 2");
    cr.addMemento(or.saveStateToMemento());

    or.setState("State 3");
    cr.addMemento(or.saveStateToMemento());

    or.setState("State 4");
    System.out.println("Current State: "+ or.getState());

    or.getStateFromMemento(cr.getMemento(0));
    System.out.println("First save State: "+or.getState());

    or.getStateFromMemento(cr.getMemento(1));
    System.out.println("Second save state: "+or.getState());
    



    }

    
}
