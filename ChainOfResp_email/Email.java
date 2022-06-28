package Email;

public class Email {
    private int id;
    private String  messsage;
    private Priority priority;

public Email(){
  
}

    public Email(int id, String messsage, Priority priority) {
        this.id = id;
        this.messsage = messsage;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

  

    
}
