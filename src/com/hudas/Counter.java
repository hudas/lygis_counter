package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Counter {

    private int value;

    synchronized public int read() {
        return value;
    }

    synchronized public void advance() {
        value++;
        this.notifyAll();
    }

    synchronized public void await(int value) throws InterruptedException {
        if (value <= 0) {
            return;
        }

        while (true) {
            this.wait();
            if (value < this.value) {
                break;
            }
        }
    }
}
