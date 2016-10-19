package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class EntryPoint {

    public static void main(String... args) {
        System.out.println("Starting...");

        // Inicializuojame ligonine su 3 registraturomis.
        Hospital santariskes = new Hospital();
        new HealthInspection(santariskes).start();

        Reception first = new Reception(santariskes);
        Reception second = new Reception(santariskes);
        Reception third = new Reception(santariskes);

        first.start();
        System.out.println("Starting...");

        second.start();
        System.out.println("Starting...");

        third.start();
        System.out.println("Starting...");

        // Jeigu susirgs daug pacientu - ligone paskelbs epidejima
        santariskes.notifyEpidemy();
        System.out.println("Starting...");


        // Inspekcija renka viesa ataskaita apie serganciuosius

    }
}
