package d03_06_2022;
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//        atribut koji kaze da li se moze reciklirati
//        osnovna cena
//        gettere i setter za atribute
//        konstuktori koji su vam potrebni
//        racuna cenu tako da ispunjava uslova:
//        ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//        ako nije u cenu ulazi samo osnovna cena
//        metoda stampaj stampa sve podatke iz klase tetrapak.


public class Tetrapak extends Ambalaza{

    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak() {
    }

    public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }



    @Override
    public double cenaArtikla() {
        if(daLiSeReciklira){
            return this.tezinaPakovanja() * 1.5 + this.getOsnovnaCena();
        }else{
            return this.getOsnovnaCena();
        }
    }

    @Override
    public void print() {
        System.out.println("Tetrapak: ");
        System.out.println("Bar kod: " + this.getBarKod());
        System.out.println("Naziv artikla: " + this.getNazivArtikla());
        System.out.println("Neto tezina:" + this.getNetoTezina());
        System.out.println("Bruto tezina: " + this.getBrutoTezina());
        System.out.println("Osnovna cena " + this.getOsnovnaCena());
        System.out.println("Cena artikla " + this.cenaArtikla());
        System.out.println();

    }
}
