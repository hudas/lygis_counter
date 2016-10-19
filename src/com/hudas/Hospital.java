package com.hudas;

/**
 * Sinchronizuotas objektas - Keltas.
 * Keltas talpina keleivius ir perkelia juos per sąsiaurį.
 */
public class Hospital {

    private static final int FLU_EPIDEMY = 250;


    private Counter sickWithFlu = new Counter();

    public void getReport() {
        System.out.println(String.format("Pateikiama ataskaita: gripu serga: %d asmenys", sickWithFlu.read()));
    }

    public void treatPatient() {
        sickWithFlu.adjust();
    }

    public void notifyEpidemy() {
        System.out.println("Laukiama epidemijos...");

        sickWithFlu.await(FLU_EPIDEMY);
        System.out.println(String.format("Gripu serga daugiau nei: %d asmenų skelbiama epidemija.", sickWithFlu.read()));
    }
}
