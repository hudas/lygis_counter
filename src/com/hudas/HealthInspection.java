package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class HealthInspection extends Thread {

    private Hospital hospital;

    public HealthInspection(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public void run() {

        while (true) {

            hospital.getReport();

            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Sistema baigia darbą, klaida laukiant ataskaitos");
            }
        }
    }
}
