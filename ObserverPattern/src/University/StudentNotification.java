package University;

public class StudentNotification extends Observer {
   
    StudentNotification(Notification n){
        this.notification=n;
        n.addObserver(this);
        //this.notification.addObserver(this);
        // n.addObserver(this);
    }

    @Override
    public void message() {
        System.out.println("Student Notification via "+notification.getState());
    }

}
