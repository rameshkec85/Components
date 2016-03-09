package com.andhradroid.common.components.logger;

import java.util.Arrays;
import java.util.List;

public class ObjectArray<T> {
    private T[] mObjs;
    private long[] mLongs;
    private int[] mInts;
    private List<T> mLists;

    private ObjectArray() {
    }

    public ObjectArray(T[] objs) {
        this();
        this.mObjs = objs;
    }

    public ObjectArray(long[] longs) {
        this();
        this.mLongs = longs;
    }

    public ObjectArray(int[] ints) {
        this();
        this.mInts = ints;
    }

    public ObjectArray(List<T> lists) {
        this();
        this.mLists = lists;
    }

    public String toString() {
        String response;
        if (this.mObjs != null) {
            response = Arrays.toString(this.mObjs);
        } else if (this.mLongs != null) {
            response = Arrays.toString(this.mLongs);
        } else if (this.mInts != null) {
            response = Arrays.toString(this.mInts);
        } else if (this.mLists != null) {
            response = Arrays.toString(this.mLists.toArray());
        } else {
            response = "";
        }

        return response;
    }
}
