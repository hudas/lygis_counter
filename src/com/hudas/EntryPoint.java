package com.hudas;

/**
 *
 * Inicializuojamas 0. Turi funkcijas
 advance() - nedalomai padidinti skaitliuką vienetu;
 read   () - nuskaityti skaitliuko reiksmę;
 await  (value) - laukti, kol skaitliuko reiksme nesusilygins
 su value.
 Pateikti skaitiklio prasmingą panaudojimą.


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
        second.start();
        third.start();

        santariskes.notifyEpidemy();
    }
}
