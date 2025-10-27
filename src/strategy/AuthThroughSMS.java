package strategy;
public class AuthThroughSMS implements AuthStrategy {
    @Override
    public void login(String username){
        System.out.println("To sign in for " + username+" account you will use SMS Authorization");
    }
}