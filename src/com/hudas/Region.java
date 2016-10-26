package com.hudas;

import static java.lang.String.format;

/**
 * Regionas - realizuotas atskiroje gijoje.
 */
public class Region extends Thread {

    private String name;
    private Counter counter;

    private int epidemy = 250;


    public Region(String name, int threshold, Counter counter) {
        this.counter = counter;
        this.name = name;
        this.epidemy = threshold;
    }

    private void notifyEpidemy() {
        System.out.println("Laukiama epidemijos...");

        try {
            counter.await(epidemy);
        } catch (InterruptedException e) {

        }
        System.out.println(format("Gripu šalyje serga daugiau nei: %d asmenų skelbiama epidemija regione: %s .", epidemy, name));
    }


    /**
     * Regionas laukia kol bus peržengta regionui būdinga epidemijos riba.
     */
    @Override
    public void run() {
        notifyEpidemy();
    }
}
