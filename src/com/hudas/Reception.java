package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class Reception extends Thread {

    public static final int PATIENTS_AT_RECEPTION = 100;
    private Hospital hospital;
    private int receptionNumber;


    public Reception(Hospital hospital, int number) {
        this.hospital = hospital;
        this.receptionNumber = number;
    }

    @Override
    public void run(){

        for(int i = 0; i < PATIENTS_AT_RECEPTION; i++) {
            hospital.treatPatient();
            System.out.println(String.format("Registratūroje nr. %d užsiregistravo asmuo %d ", receptionNumber, i + 1));
        }
    }
}
