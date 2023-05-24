package Strategypattern;

public class UserLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("User login successful");
    }
}
