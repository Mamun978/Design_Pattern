package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory= new PhoneFactory();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter phone type: ");
        String phoneType=sc.next();

        Phone phone= phoneFactory.getPhone(phoneType);
        System.out.println(phone.ram(4)+" "+phone.screen(6));
    }
}
