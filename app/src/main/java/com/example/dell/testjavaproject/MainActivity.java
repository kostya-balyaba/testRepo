package com.example.dell.testjavaproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.dell.testjavaproject.car.Audi;
import com.example.dell.testjavaproject.car.Driver;
import com.example.dell.testjavaproject.cards.ABankCard;
import com.example.dell.testjavaproject.cards.CreditCard;
import com.example.dell.testjavaproject.cards.MasterCard;
import com.example.dell.testjavaproject.cards.Visa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        Test<ViewC> test = new Test<>(new ViewC());
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }


    enum MODE {MODE_VIEW, MODE_WRITE}

    private void startExtendsBankCardExample() {
        MasterCard masterCard = new MasterCard(300);
        Visa visa = new Visa(500);
        int needToPay = 400;

        /*pay(needToPay, masterCard, visa);*/
        if (masterCard.isCanPay(needToPay)) {
            showToast(masterCard.getType());
            masterCard.pay(needToPay);
        } else if (visa.isCanPay(needToPay)) {
            showToast(visa.getType());
            visa.pay(needToPay);
        } else
            showToast("not enough money =)");
    }

    private void pay(int amount, ABankCard... cards) {
        if (cards != null && amount > 0) {
            for (ABankCard card : cards)
                if (card.isCanPay(amount)) {
                    card.pay(amount);
                    showToast(card.getType());
                    return;
                }
            showToast("not enough money =)");
        }
    }

    private void startPolymBankCardExample() {
        ABankCard masterCard = new MasterCard(300);
        ABankCard visa = new Visa(500);
        int needToPay = 200;

        if (masterCard.isCanPay(needToPay)) {
            showToast(masterCard.getType());
            masterCard.pay(needToPay);
        } else if (visa.isCanPay(needToPay)) {
            showToast(visa.getType());
            visa.pay(needToPay);
        } else
            showToast("not enough money =)");
    }

    private void startInterfaceBankCardExample() {
        ABankCard masterCard = new MasterCard(300);
        ABankCard visa = new Visa(500);
        int needToPay = 200;

        if (masterCard.isCanPay(needToPay)) {
            if (masterCard instanceof CreditCard)
                showToast(String.format("%s %s", masterCard.getType(), ((CreditCard) masterCard).getCardNumber()));
            masterCard.pay(needToPay);
        } else if (visa.isCanPay(needToPay)) {
            showToast(visa.getType());
            visa.pay(needToPay);
        } else
            showToast("not enough money =)");
    }

    private void startDelegate() {
        Driver driver = new Driver(new Audi());
        driver.ride();
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
