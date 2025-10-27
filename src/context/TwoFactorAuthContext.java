package context;
import strategy.AuthStrategy;
public class TwoFactorAuthContext {
    private AuthStrategy strategy;
    public void setStrategy(AuthStrategy strategy){
        this.strategy = strategy;
    }
    public void login(String username){
        strategy.login(username);
    }


}