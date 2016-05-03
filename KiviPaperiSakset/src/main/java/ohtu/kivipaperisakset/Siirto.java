package ohtu.kivipaperisakset;

public enum Siirto {

    Kivi("k"),
    Paperi("p"),
    Sakset("s");
    
    private final String valinta;

    Siirto(String valinta) {
        this.valinta = valinta;
    }
    
    public String getValinta() {
        return valinta;
    }
    
    public static Siirto convertToSiirto(String valinta) {
        switch(valinta) {
            case "k":
                return Siirto.Kivi;
            case "p":
                return Siirto.Paperi;
            case "s":
                return Siirto.Sakset;
            default:
                return null;
        }
    }
}
