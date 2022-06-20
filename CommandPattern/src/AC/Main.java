package AC;

public class Main {
    public static void main(String[] args) {
        AirCon ac1=new AirCon();
        AirCon ac2=new AirCon();

        Remote remote=new Remote();
        remote.setCommand(new TogglePower(ac2));
        remote.run();
        remote.setCommand(new IncreaseTemp(ac2));
        remote.run();
        // remote.run();

        System.out.println(ac1);
        System.out.println(ac2);
    }

}
