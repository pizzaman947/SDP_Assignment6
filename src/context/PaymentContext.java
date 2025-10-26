package context;
import strategy.PaymentStrategy;
public class PaymentContext{
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    public void pay(float amount){
        strategy.pay(amount);
    }


}