public class MobileFactory {
    

    public static Mobile createMobile(String company){

        Mobile m=null;

        if(company.equals("Samsung")){
            m=new Samsung();
        }

        else if(company.equals("Nokia")){
            m=new Nokia();
        }
        else{
            m=new Vivo();
        }

        return m;
    }
}
