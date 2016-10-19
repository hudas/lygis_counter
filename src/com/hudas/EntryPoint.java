package com.hudas;

/**
 * Created by Ignas on 2016-10-19.
 */
public class EntryPoint {

    public static void main(String... args) {

        // Inicializuojame ligonine su 3 registraturomis.
        Hospital santariskes = new Hospital();

        Reception first = new Reception(santariskes, 1);
        Reception second = new Reception(santariskes, 2);
        Reception third = new Reception(santariskes, 3);

        // Jeigu susirgs daug pacientu - ligone paskelbs epidejima
        santariskes.notifyEpidemy();

        // Inspekcija renka viesa ataskaita apie serganciuosius
        new HealthInspection(santariskes).start();

        // Rytas, 8:00, registraturos pradeda darbą :)
        first.start();
        second.start();
        third.start();
    }
}
