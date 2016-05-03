package ohtu.kivipaperisakset.pelaajat;

// "Muistava tekoäly"
import java.util.LinkedList;
import java.util.List;
import ohtu.kivipaperisakset.Siirto;

public class TekoalyParannettu implements Tekoaly {

    private List<Siirto> muisti;
    private int muistinKoko;

    public TekoalyParannettu(int muistinKoko) {
        muisti = new LinkedList<>();
        this.muistinKoko = muistinKoko;
    }

    @Override
    public void asetaSiirto(Siirto siirto) {
        // jos muisti täyttyy, unohdetaan viimeinen alkio
        if (muisti.size() > muistinKoko) {
            muisti.remove(muisti.size() - 1);
        }

        muisti.add(siirto);
    }

    @Override
    public Siirto teeSiirto() {
        if (muisti.size() < 2) {
            return Siirto.Kivi;
        }

        Siirto viimeisinSiirto = muisti.get(muisti.size() - 1);

        int k = 0;
        int p = 0;
        int s = 0;

        for (int i = 0; i < muisti.size() - 1; i++) {
            if (viimeisinSiirto == muisti.get(i)) {
                Siirto seuraava = muisti.get(i + 1);

                if (seuraava == Siirto.Kivi) {
                    k++;
                } else if (seuraava == Siirto.Paperi) {
                    p++;
                } else {
                    s++;
                }
            }
        }

        // Tehdään siirron valinta esimerkiksi seuraavasti;
        // - jos kiviä eniten, annetaan aina paperi
        // - jos papereita eniten, annetaan aina sakset
        // muulloin annetaan aina kivi
        if (k > p && k > s) {
            return Siirto.Paperi;
        } else if (p > k && p > s) {
            return Siirto.Sakset;
        } else {
            return Siirto.Kivi;
        }

        // Tehokkaampiakin tapoja löytyy, mutta niistä lisää 
        // Johdatus Tekoälyyn kurssilla!
    }
}
