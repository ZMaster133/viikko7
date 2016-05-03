package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.pelaajat.Ihminen;
import ohtu.kivipaperisakset.Siirto;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    public KPSPelaajaVsPelaaja() {
        super(new Ihminen());
    }
    
    @Override
    protected Siirto pelaaTokanSiirto() {
        System.out.println("Toisen pelaajan siirto: ");
        return pelaaja2.teeSiirto();
    }
}