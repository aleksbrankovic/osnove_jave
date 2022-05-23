package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();

        prvi.naziv = "Cokolada";
        prvi.cena = 100;
        prvi.tezina = 200;

        prvi.stampaj();
        System.out.println("Povecana cena je " + prvi.povecajCenu(20));

        System.out.println("Cena sa popustom je " + prvi.vratiCenuSaPopustom(20));

        System.out.println("Postarina iznosi " + prvi.racunajPostarinu());


        Proizvod drugi = new Proizvod();

        drugi.naziv = "Krofna";
        drugi.cena = 50;
        drugi.tezina = 100;

        drugi.stampaj();
        System.out.println("Povecana cena je " + drugi.povecajCenu(10));

        System.out.println("Cena sa popustom je " + drugi.vratiCenuSaPopustom(10));

        System.out.println("Postarina iznosi " + drugi.racunajPostarinu());













    }
}
