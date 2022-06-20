package University;

public class Test {
    public static void main(String[] args) {

        Notification notification=new Notification();

        // Observer ob1=new StudentNotification(notification);
        
        // notification.addObserver(ob1);
        // notification.setState("Phone");

        // Observer ob2=new TeacherNotification(notification);
        // notification.addObserver(ob2);
        // notification.setState("email");


        new StudentNotification(notification);
        notification.setState("Phone");

        

        new TeacherNotification(notification);
        notification.setState("mail");


    
      

    }
}
