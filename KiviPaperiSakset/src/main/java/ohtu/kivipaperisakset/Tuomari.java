package ohtu.kivipaperisakset;

// Tuomari pitää kirjaa ensimmäisen ja toisen pelaajan pisteistä sekä tasapelien määrästä.
public class Tuomari {

    private int ekanPisteet;
    private int tokanPisteet;
    private int tasapelit;

    public Tuomari() {
        this.ekanPisteet = 0;
        this.tokanPisteet = 0;
        this.tasapelit = 0;
    }

    public void kirjaaSiirto(Siirto ekanSiirto, Siirto tokanSiirto) {
        if (tasapeli(ekanSiirto, tokanSiirto)) {
            tasapelit++;
        } else if (ekaVoittaa(ekanSiirto, tokanSiirto)) {
            ekanPisteet++;
        } else {
            tokanPisteet++;
        }
    }

    // sisäinen metodi, jolla tarkastetaan tuliko tasapeli
    private boolean tasapeli(Siirto eka, Siirto toka) {
        return eka.equals(toka);
    }

    // sisäinen metodi joka tarkastaa voittaako eka pelaaja tokan
    private boolean ekaVoittaa(Siirto eka, Siirto toka) {
        if (eka == Siirto.Kivi && toka == Siirto.Sakset) {
            return true;
        } else if (eka == Siirto.Sakset && toka == Siirto.Paperi) {
            return true;
        } else if (eka == Siirto.Paperi && toka == Siirto.Kivi) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String s = "Pelitilanne: " + ekanPisteet + " - " + tokanPisteet + "\n"
                + "Tasapelit: " + tasapelit;
        return s;
    }
}