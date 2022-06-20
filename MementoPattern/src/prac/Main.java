package prac;

public class Main {
    public static void main(String[] args) {

        Editor  e=new Editor();
        e.setText("My name ");
        CareTaker c=new CareTaker();
        c.addMomento(new Momento(e));
        e.setText("Mamun");
        c.addMomento(new Momento(e));
        e.setColor("blue");
        c.addMomento(new Momento(e));
        c.previousMomento();

    }


}
