package com.company;

import java.util.Scanner;

public class Main {
    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;


    public static void main(String[] args) {
        // Parodyti vartotoojui kiek yra uzduociu
        // paklausti vartototjo kokia uzduoti parodyti
        // nuskaityti vartotojo pasirinkima
        // pagal ivesta sveika skaiciu rodyti uzduoties vykdyma
        // programa kartoja sia seka kol vartotojoas neiveda 0

        Scanner skaitytuvas = new Scanner(System.in);

        while (true) {
            System.out.println("Turime is viso 0 uzduociu");
            System.out.println("Oveskite uzduoties numeri kad ja vykdyti");
            System.out.println("Ivedus 0 programa bus baigta");

            int pasirinkimas = skaitytuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    UZduotis01 pirmoji = new UZduotis01();
                    break;
            }
        }
    }
}
