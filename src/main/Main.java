package main;

import context.TwoFactorAuthContext;
import strategy.AuthThroughSMS;
import strategy.AuthThroughSecretQuestion;

public class Main {
    public static void main(String[] args) {
        String username = "Rakhat0612";

        TwoFactorAuthContext context = new TwoFactorAuthContext();
        context.setStrategy(new AuthThroughSMS());
        context.login(username);

        context.setStrategy(new AuthThroughSecretQuestion());
        context.login(username);
    }
}