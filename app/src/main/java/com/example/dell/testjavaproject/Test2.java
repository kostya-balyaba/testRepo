package com.example.dell.testjavaproject;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 02.03.2017.
 */

public class Test2<T> {

    T object;

    public Test2(T object) {
        this.object = object;
    }

    public T getObject(T another) {
        return object;
    }

}
