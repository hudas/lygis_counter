package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Reception extends Thread {

    public static final int PATIENTS_AT_RECEPTION = 1000;
    private Hospital hospital;

    public Reception(Hospital hospital) {
        System.out.println("Registratūra pradeda darbą.");
        this.hospital = hospital;
    }

    @Override
    public void run(){
        for(int i = 0; i < PATIENTS_AT_RECEPTION; i++) {
            hospital.treatPatient();

            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
