package Strategypattern;

public class AdminLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Admin login Successfull");
    }
}
