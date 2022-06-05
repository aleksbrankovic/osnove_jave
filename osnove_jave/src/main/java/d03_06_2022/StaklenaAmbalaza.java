package d03_06_2022;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//        kaucija za flasu
//        atribut koji kaze da li se za flasu placa kaucija
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu
//        ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//        ako se ne placa, (osnovna cena) * 1.2
//        metoda stampaj stampa sve podatke iz klase staklena flasa.


public class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(daLiSePlacaKaucija){
            return this.getOsnovnaCena() * 1.2 + this.getKaucija();
        }else{
            return this.getOsnovnaCena() * 1.2;
        }
    }

    @Override
    public void print() {
        System.out.println("Staklena flasa: ");
        System.out.println("Bar kod: " + this.getBarKod());
        System.out.println("Naziv artikla: " + this.getNazivArtikla());
        System.out.println("Osnovna cena " + this.getOsnovnaCena());
        System.out.println("Cena artikla " + this.cenaArtikla());
        System.out.println();

    }
}
