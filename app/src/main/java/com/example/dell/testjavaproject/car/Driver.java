package com.example.dell.testjavaproject.car;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class Driver {

    private AbstractCar mCar;

    public Driver(AbstractCar car) {
        this.mCar = car;
    }

    public void ride() {
        mCar.start();
        mCar.turnLeft();
    }

}
