package d02_06_2022;
//U glavnom programu kreirati jednog magacionera i jednog menadzera,
//        postaviti sektore u kojima rade i ispisati platu za svakog.

public class SektorMain {
    public static void main(String[] args) {
        Radnik radnik_1 = new Magacioner("Lazar Stojkovic");
        Radnik radnik_2 = new Menadzer("Aleksandra Brankovic");
        Sektor sektor_1 = new Sektor("Sektor 1", 50000);
        Sektor sektor_2 = new Sektor("Sektor 2", 80000);
        Sektor sektor_3 = new Sektor("Sektor 3", 100000);

        radnik_1.zaposliUSektor(sektor_1);
        radnik_1.zaposliUSektor(sektor_3);
        radnik_2.zaposliUSektor(sektor_1);
        radnik_2.zaposliUSektor(sektor_2);

        printRadnik(radnik_1);
        printRadnik(radnik_2);

    }

    public static void printRadnik(Radnik radnik) {
        System.out.println("Radnik " + radnik.getImeIPrezime() + " je zaposljen u sektorima: ");
        for (int i = 0; i < radnik.getListaSektora().size(); i++) {
            System.out.println(radnik.listaSektora.get(i).getNazivSektora());
        }
        System.out.println("Sa mesecnom platom od: " + radnik.kolikaJePlata());
    }


}
