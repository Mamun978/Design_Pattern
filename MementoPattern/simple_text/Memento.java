package simple_text;

public class Memento {
    // Memento pattern uses three actor classes.
    //  Memento contains state of an object to be restored. Originator creates and 
    //stores states in Memento objects and Caretaker object is responsible to restore object state from Memento.
    //  We have created classes Memento, Originator and CareTaker.

    private String state;

    Memento(String state){
        this.state=state;
    }

    public String getState(){
        return state;
    }
    
}
