package com.example.dell.testjavaproject;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by Unreal Mojo
 *
 * @author Kostya Balyaba
 *         on 28.02.2017.
 */

public class Test<T> {

    T obj;

    public Test(T obj) {
        this.obj = obj;
        List<?> hhh = new ArrayList(Arrays.asList(new int[]{1, 2, 3}));
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
