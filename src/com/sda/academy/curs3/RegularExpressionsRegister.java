package com.sda.academy.curs3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsRegister {
    public static void main(String[] args) {
        // Dorim sa validam numele si numarul de telefon al utilizatorului
        System.out.print("Input Name: ");
        Scanner scannerNume = new Scanner(System.in);
        String numeUtilizator = scannerNume.nextLine();
//        System.out.print("Introduceti numarul: ");
//        Scanner scannerNumar = new Scanner(System.in);
//        String numarUtilizator = scannerNumar.nextLine();

        //Date de intrare


        Pattern patternNumeUtilizator = Pattern.compile("[A-Z][a-z]+ [A-Z][a-z]+");
        Matcher matcherNumeUtilizator = patternNumeUtilizator.matcher(numeUtilizator);
//        Pattern patternNumarUtilizator = Pattern.compile("[0-9]{10}");
//        Matcher matcherNumarUtilizator = patternNumarUtilizator.matcher(numarUtilizator);

//        if (matcherNumeUtilizator.matches() && matcherNumarUtilizator.matches()) {
//            System.out.println(numarUtilizator + " si " + numeUtilizator + " sunt corecte");
//
//        } else {
//            System.out.println(numarUtilizator + " si " + numeUtilizator + " nu sunt corecte");
//
//        }
        for ( int incercari = 1; incercari <= 3; incercari++){
            System.out.println("incercari = " + incercari );
            if (matcherNumeUtilizator.matches()){
                System.out.println("Numele este corect");
                break;
            } else {
                System.out.println("nu v-ati introdus datele corecte");
                System.out.println("Introdu alt nume");
                scannerNume = new Scanner(System.in);
                numeUtilizator = scannerNume.nextLine();
                matcherNumeUtilizator = patternNumeUtilizator.matcher(numeUtilizator);
            }
        }
        System.out.println("Sfarsit Program");

    }
}
