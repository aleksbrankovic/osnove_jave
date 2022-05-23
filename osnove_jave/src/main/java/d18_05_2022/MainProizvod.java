package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod a = new Proizvod();

        a.naziv = "Mleko";
        a.cena = 70.5;
        a.tezina = 10.2;



        Proizvod b = new Proizvod();

        b.naziv = "Krofna";
        b.cena = 50;
        b.tezina = 20.5;

        Proizvod.stampaj(a.naziv, a.cena, a.tezina);
        Proizvod.stampaj(b.naziv, b.cena, b.tezina);


    }
}
