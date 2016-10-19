package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Counter {

    private int value;

    public int read() {
        return value;
    }

    public void adjust() {
        value++;
    }

    public void await(int value) {
        while (value != this.value) {
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
