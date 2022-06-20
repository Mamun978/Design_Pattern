import java.util.Scanner;

public class demo {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a company name: ");
        String company=sc.nextLine();

        Mobile m=MobileFactory.createMobile(company);
      
        System.out.println(m);


    }
}
