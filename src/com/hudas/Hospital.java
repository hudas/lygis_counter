package com.hudas;

/**
 * Sinchronizuotas objektas - Keltas.
 * Keltas talpina keleivius ir perkelia juos per sąsiaurį.
 */
public class Hospital extends Thread {

    private static final int FLU_EPIDEMY = 250;
    public static final int PATIENTS_AT_RECEPTION = 1000;


    private Counter sickCounter;

    public Hospital(Counter sickCounter) {
        this.sickCounter = sickCounter;
    }

    public void treatPatient() {
        sickCounter.advance();
    }

    @Override
    public void run() {
        try {

            for(int i = 0; i < PATIENTS_AT_RECEPTION; i++) {
                treatPatient();

                Thread.currentThread().sleep(1);
            }

        } catch (InterruptedException e) {
            System.out.println("Gydytojas išėjo namo");
        }
    }
}
