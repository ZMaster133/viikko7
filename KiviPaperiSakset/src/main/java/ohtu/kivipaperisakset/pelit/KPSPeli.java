package ohtu.kivipaperisakset.pelit;

import ohtu.kivipaperisakset.pelaajat.Ihminen;
import ohtu.kivipaperisakset.pelaajat.Pelaaja;
import ohtu.kivipaperisakset.Siirto;
import ohtu.kivipaperisakset.pelaajat.Tekoaly;
import ohtu.kivipaperisakset.Tuomari;

public abstract class KPSPeli implements Peli {
    private Tuomari tuomari;
    
    protected Pelaaja pelaaja1;
    protected Pelaaja pelaaja2;
    
    private boolean kaynnissa;
    
    public KPSPeli(Pelaaja pelaaja2) {
        this.tuomari = new Tuomari();
        this.pelaaja1 = new Ihminen();
        this.pelaaja2 = pelaaja2;
        
        this.kaynnissa = true;
    }
    
    @Override
    public void pelaa() {
        while(kaynnissa) {
            pelaaKierros();
        }
        
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    private void pelaaKierros() {
        Siirto ekanSiirto = pelaaEkanSiirto();
        Siirto tokanSiirto = pelaaTokanSiirto();
        
        if (ekanSiirto == null || tokanSiirto == null) {
            kaynnissa = false;
            return;
        }
        
        paivitaTekoalyt(ekanSiirto, tokanSiirto);
        
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        
        System.out.println(tuomari);
    }
    
    private void paivitaTekoalyt(Siirto ekanSiirto, Siirto tokanSiirto) {
        paivitaTekoaly(pelaaja1, tokanSiirto);
        paivitaTekoaly(pelaaja2, ekanSiirto);
    }
    
    private void paivitaTekoaly(Pelaaja pelaaja, Siirto siirto) {
        if (pelaaja instanceof Tekoaly) {
            ((Tekoaly) pelaaja).asetaSiirto(siirto);
        }
    }
    
    private Siirto pelaaEkanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return pelaaja1.teeSiirto();
    }
    
    protected abstract Siirto pelaaTokanSiirto();
}
