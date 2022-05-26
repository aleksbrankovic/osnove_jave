package d_24_05_2022;

public class Transakcija {

    private int idTransakcije;
    private Racun posiljalac;
    private Racun primalac;


    public Transakcija(int idTransakcije, Racun posiljalac, Racun primalac){
        this.idTransakcije = idTransakcije;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizija (double iznosTransakcije) {
        if (iznosTransakcije < 4500) {
            return iznosTransakcije * 45/100;
        } else {
            return iznosTransakcije * 1/100;
        }
    }

    public void izvrsiTransakciju(int vrednost){
        this.posiljalac.promenaStanjaNaRacunu(vrednost + provizija(vrednost));
        if (this.posiljalac.getStanjeNaRacunu() > vrednost) {
            this.primalac.promenaStanja(vrednost);
        }
    }

    public void stampaj (){
        System.out.println("ID transakcije: " + idTransakcije);
        System.out.println("Racun sa: " + this.posiljalac.getImeIPrezime() + " - " + posiljalac.getBrojRacuna());
        System.out.println("Racun na: " + this.primalac.getImeIPrezime() + " - " + posiljalac.getBrojRacuna());
        System.out.println("Primalac: " + primalac.getStanjeNaRacunu());
        System.out.println("Posiljalac: " + posiljalac.getStanjeNaRacunu());
    }

}
