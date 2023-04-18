package Factory;

public class PhoneFactory {

    public Phone getPhone(String phoneType){
        Phone phone=null;
        if(phoneType.equalsIgnoreCase("Samsung")){
            return new Samsung();
        }
        if(phoneType.equalsIgnoreCase("Redmi")){
            return  new Redmi();
        }
        if(phoneType.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }
        else
        {
            System.out.println("Enter valid phone");
        }
        return phone;
    }
}
