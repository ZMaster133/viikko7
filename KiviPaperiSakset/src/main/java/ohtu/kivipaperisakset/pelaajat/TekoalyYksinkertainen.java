package ohtu.kivipaperisakset.pelaajat;

import ohtu.kivipaperisakset.Siirto;

public class TekoalyYksinkertainen implements Tekoaly {

    private int siirto;

    public TekoalyYksinkertainen() {
        siirto = 0;
    }

    public void asetaSiirto(Siirto ekanSiirto) {
        // ei tehdä mitään
    }

    @Override
    public Siirto teeSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return Siirto.Kivi;
        } else if (siirto == 1) {
            return Siirto.Paperi;
        } else {
            return Siirto.Sakset;
        }
    }
}
