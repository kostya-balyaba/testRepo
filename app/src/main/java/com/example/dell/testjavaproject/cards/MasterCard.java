package com.example.dell.testjavaproject.cards;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class MasterCard extends ABankCard implements CreditCard {

    private int creditBalance;

    public MasterCard(int balance) {
        super("Master Card");
    }

    @Override
    public boolean isCanPay(int amount) {
        return creditBalance >= amount;
    }

    @Override
    public void pay(int amount) {
        creditBalance = creditBalance - amount;
    }

    @Override
    public String getCardNumber() {
        return "356211548456";
    }

}
