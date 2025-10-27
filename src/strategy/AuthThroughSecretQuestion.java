package strategy;
public class AuthThroughSecretQuestion implements AuthStrategy {
    @Override
    public void login(String username){
        System.out.println("To sign in for " + username+" account you will use Secret Question Authorization");
    }
}