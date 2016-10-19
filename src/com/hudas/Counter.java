package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Counter {

    private int value;

    public int read() {
        synchronized (this) {
            return value;
        }
    }

    public void adjust() {
        synchronized (this) {
            value++;
            this.notifyAll();
        }
    }

    public void await(int value) {
        synchronized (this) {
            while (true) {

                try {
                    this.wait();

                    if (value == this.value) {
                        System.out.println("Value found!");
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
