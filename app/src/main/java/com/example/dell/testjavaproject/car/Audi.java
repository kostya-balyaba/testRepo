package com.example.dell.testjavaproject.car;

import android.util.Log;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class Audi extends AbstractCar {

    @Override
    public AbstractEngine getEngine() {
        return new AudiEngine();
    }

}
