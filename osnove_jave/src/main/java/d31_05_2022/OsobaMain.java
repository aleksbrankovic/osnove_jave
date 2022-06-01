package d31_05_2022;

public class OsobaMain {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Mihajlo Mitic","1235478512541",1990,
                12,"krilo",false);
        Igrac igrac2 = new Igrac("Bosko Markovic","1254856235847", 1988,
                1,"desni bek", true);

        igrac1.stampaj();
        igrac2.stampaj();

        System.out.println();

        Trener trener1 = new Trener("Milos Milosevic","1452154789541",1986,
                7,"kondicioni");
        Trener trener2 = new Trener("Zoran Stojanovic","1254856598745", 1985,
                9,"pomocni");

        trener1.stampaj();
        trener2.stampaj();
    }
}
