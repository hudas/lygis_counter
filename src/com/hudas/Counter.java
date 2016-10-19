package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Counter {

    private int value;

    synchronized public int read() {
        return value;
    }

    synchronized public void adjust() {
        value++;
        notifyAll();
    }

    synchronized public void await(int value) {
        while (true) {

            try {
                wait();
                System.out.println("Lyginam: " + this.value);
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
