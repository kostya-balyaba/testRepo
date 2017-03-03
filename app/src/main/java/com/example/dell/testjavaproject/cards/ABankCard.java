package com.example.dell.testjavaproject.cards;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public abstract class ABankCard {

    private String type;

    public ABankCard(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



    public abstract boolean isCanPay(int amount);

    public abstract void pay(int amount);

}
