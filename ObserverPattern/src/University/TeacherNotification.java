package University;

public class TeacherNotification extends Observer {
    
    TeacherNotification(Notification n){
        this.notification=n;
        // n.addObserver(this);
    }

    @Override
    public void message() {
        System.out.println("Teacher Notiification "+notification.state);
    }
}
