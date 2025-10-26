package strategy;
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(float amount){
        System.out.println("You paid "+amount+" through Credit Card");
    }
}