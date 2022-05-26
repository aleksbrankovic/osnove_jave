package d_24_05_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun posiljaoc  = new Racun("840-12-1868", "Aleksandra Brankovic", 1200);
        Racun primalac = new Racun("840-11-1985","Jovan Jovanovic",1000);

        Transakcija transakcija = new Transakcija(123,posiljaoc,primalac);

        transakcija.izvrsiTransakciju(200);
        transakcija.stampaj();

    }
}
