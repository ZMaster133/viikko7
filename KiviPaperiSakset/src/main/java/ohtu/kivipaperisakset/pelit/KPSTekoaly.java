package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.Siirto;
import ohtu.kivipaperisakset.pelaajat.Tekoaly;

public class KPSTekoaly extends KPSPeli {
    public KPSTekoaly(Tekoaly tekoaly) {
        super(tekoaly);
    }

    @Override
    protected Siirto pelaaTokanSiirto() {
        Siirto tokanSiirto = pelaaja2.teeSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}
