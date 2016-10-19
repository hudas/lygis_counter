package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class EntryPoint {

    public static void main(String... args) {
        System.out.println("Starting...");

        // Inicializuojame ligonine su 3 registraturomis.
        Hospital santariskes = new Hospital();

        Reception first = new Reception(santariskes);
        Reception second = new Reception(santariskes);
        Reception third = new Reception(santariskes);
        first.start();
        second.start();
        third.start();

        System.out.println("DAFUQ IS HAPPENING");
        // Jeigu susirgs daug pacientu - ligone paskelbs epidejima
        santariskes.notifyEpidemy();

        // Inspekcija renka viesa ataskaita apie serganciuosius
        new HealthInspection(santariskes).start();

        // Rytas, 8:00, registraturos pradeda darbą :)
        System.out.println("Ending...");
    }
}
