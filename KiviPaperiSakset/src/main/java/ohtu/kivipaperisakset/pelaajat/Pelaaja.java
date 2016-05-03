package ohtu.kivipaperisakset.pelaajat;

import java.util.Scanner;
import ohtu.kivipaperisakset.Siirto;

public interface Pelaaja {
    final Scanner scanner = new Scanner(System.in);
    
    public Siirto teeSiirto();
}
