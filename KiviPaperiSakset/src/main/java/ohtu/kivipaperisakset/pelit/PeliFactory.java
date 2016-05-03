package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.pelaajat.TekoalyParannettu;
import ohtu.kivipaperisakset.pelaajat.TekoalyYksinkertainen;

public class PeliFactory {
    public KPSPelaajaVsPelaaja luoPelaajaVsPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
    
    public KPSTekoaly luoPelaajaVsYksinkertainenTekoaly() {
        return new KPSTekoaly(new TekoalyYksinkertainen());
    }
    
    public KPSTekoaly luoPelaajaVsParannettuTekoaly() {
        return new KPSTekoaly(new TekoalyParannettu(20));
    }
}
