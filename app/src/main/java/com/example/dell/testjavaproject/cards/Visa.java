package com.example.dell.testjavaproject.cards;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class Visa extends ABankCard {

    private int safeBalance;

    public Visa(int balance) {
        super("Visa");
    }

    @Override
    public boolean isCanPay(int amount) {
        return safeBalance >= amount;
    }

    @Override
    public void pay(int amount) {
        safeBalance = safeBalance - amount;
    }

}
