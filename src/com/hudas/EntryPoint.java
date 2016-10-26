package com.hudas;

/**
 *
 * Sąlyga:
 *
 * Inicializuojamas 0. Turi funkcijas
 *   advance() - nedalomai padidinti skaitliuką vienetu;
 *   read   () - nuskaityti skaitliuko reiksmę;
 *   await  (value) - laukti, kol skaitliuko reiksme nesusilygins
 *       su value.
 *   Pateikti skaitiklio prasmingą panaudojimą.
 *
 *
 * Dalykinė sritis: Ligoninė
 * Probleminė sritis: Gripo epidemijos identifikavimas
 *
 * Šalyje turime kelis regionus, taip pat šalyje yra kelios ligoninės.
 *
 * Visos Ligoninės registruoja sergančius gripu pacientus.
 *
 * Savivaldybės vyriausybė skelbia epidemiją savivaldybėje kai šalyje sergamumas peržengia savivaldybės taryboje nustatytą ribą.
 *
 */
public class EntryPoint {

    public static void main(String... args) {
        System.out.println("Starting...");

        // Inicializuojame skaitliuką
        Counter sickWithFlu = new Counter();

        // Šalyje yra 3 regionai
        new Region("Vilnius", 600, sickWithFlu).start();
        new Region("Kaunas", 500, sickWithFlu).start();
        new Region("Panevezys", 300, sickWithFlu).start();

        // Šalyje yra 3 ligoninės
        new Hospital(sickWithFlu).start();
        new Hospital(sickWithFlu).start();
        new Hospital(sickWithFlu).start();
    }
}
