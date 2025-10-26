package strategy;
public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(float amount){
        System.out.println("You paid "+amount+" though PayPal");
    }
}