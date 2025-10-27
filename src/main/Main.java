package main;

import context.TwoFactorAuthContext;
import strategy.AuthStrategy;
import strategy.AuthThroughSMS;
import strategy.AuthThroughSecretQuestion;

public class Main {
    public static void main(String[] args) {
        String username1 = "Rakhat0612";
        String username2 = "Adam1204";

        AuthStrategy authThroughSMS = new AuthThroughSMS();
        AuthStrategy authThroughSecretQuestion = new AuthThroughSecretQuestion();

        TwoFactorAuthContext context = new TwoFactorAuthContext();
        context.setStrategy(authThroughSMS);
        context.login(username1);

        context.setStrategy(authThroughSecretQuestion);
        context.login(username2);
    }
}