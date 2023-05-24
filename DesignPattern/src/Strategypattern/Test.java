package Strategypattern;

public class Test {

    public static void main(String[] args) {
//        LoginStrategy loginStrategy=new AdminLogin();
//        loginStrategy.login();

        LoginContext loginContext=new LoginContext(new AdminLogin());
        loginContext.doLogin();

    }
}
