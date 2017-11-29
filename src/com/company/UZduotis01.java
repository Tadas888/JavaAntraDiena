package com.company;

import java.util.Scanner;

public class UZduotis01 {
    public UZduotis01(){
        // PAsisveikinti su vartotoju
        // paprasyti ivesti jo varda
        // atspausdinti jo varda 5 kartus;

        System.out.println("Sveiki, iveskite savo varda: ");
        Scanner skaneris = new Scanner(System.in);
        String vardas = skaneris.next();
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);
        System.out.println(vardas);

    }

}
