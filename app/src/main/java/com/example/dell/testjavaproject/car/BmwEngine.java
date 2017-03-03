package com.example.dell.testjavaproject.car;

import android.util.Log;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class BmwEngine extends AbstractEngine  {

    @Override
    public void start() {
        Log.d("asd", "start riding on bmw");
    }

    @Override
    public void stop() {
        Log.d("asd", "stop riding on bmw");
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

}
