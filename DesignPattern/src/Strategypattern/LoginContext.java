package Strategypattern;

public class LoginContext {

    private LoginStrategy loginStrategy;

    LoginContext(LoginStrategy loginStrategy){
        this.loginStrategy=loginStrategy;
    }

    public void doLogin(){
        loginStrategy.login();
    }
}
