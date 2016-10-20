package com.hudas;

/**
 * Sinchronizuotas objektas - Keltas.
 * Keltas talpina keleivius ir perkelia juos per sąsiaurį.
 */
public class Hospital {

    private static final int FLU_EPIDEMY = 250;


    private Counter sickWithFlu = new Counter();

    public void getReport() {
//        System.out.println(String.format("Pateikiama ataskaita: gripu serga: %d asmenys", sickWithFlu.read()));
    }

    public void treatPatient() {
        sickWithFlu.advance();
    }

    public void notifyEpidemy() {
        System.out.println("Laukiama epidemijos...");

        try {
            sickWithFlu.await(FLU_EPIDEMY);
        } catch (InterruptedException e) {

        }
        System.out.println(String.format("Gripu serga daugiau nei: %d asmenų skelbiama epidemija.", FLU_EPIDEMY));
    }
}
