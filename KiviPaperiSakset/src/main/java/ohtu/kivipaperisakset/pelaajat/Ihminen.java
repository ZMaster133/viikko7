package ohtu.kivipaperisakset.pelaajat;

import ohtu.kivipaperisakset.Siirto;

public class Ihminen implements Pelaaja {
    @Override
    public Siirto teeSiirto() {
        return Siirto.convertToSiirto(scanner.nextLine());
    }
}
