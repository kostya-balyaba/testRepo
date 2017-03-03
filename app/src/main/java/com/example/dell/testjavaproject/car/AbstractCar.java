package com.example.dell.testjavaproject.car;

import android.widget.SimpleAdapter;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public abstract class AbstractCar {

    public void start() {
        getEngine().start();
    }

    public void stop() {
        getEngine().stop();
    }

    public void turnRight() {
        getEngine().turnRight();
    }

    public void turnLeft() {
        getEngine().turnLeft();
    }

    protected abstract AbstractEngine getEngine();



}
