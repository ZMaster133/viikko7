package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.pelit.Peli;
import ohtu.kivipaperisakset.pelit.PeliFactory;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            
            Peli peli;
            PeliFactory factory = new PeliFactory();

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                peli = factory.luoPelaajaVsPelaaja();
            } else if (vastaus.endsWith("b")) {
                peli = factory.luoPelaajaVsYksinkertainenTekoaly();
            } else if (vastaus.endsWith("c")) {
                peli = factory.luoPelaajaVsParannettuTekoaly();
            } else {
                break;
            }
            
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            peli.pelaa();
        }
    }
}
