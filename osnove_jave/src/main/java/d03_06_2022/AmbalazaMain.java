package d03_06_2022;
//U glavnom programu kreirati jednu Korpu i u nju
//        dodati nekoliko Ambalaza razlicitih tipova
//        i istestirati sve metode i ispisati ukupnu
//        cenu sa popustom.


public class AmbalazaMain {
    public static void main(String[] args) {

        Ambalaza ambalaza1 = new Tetrapak("45-1","mleko",
                100,80,true, 80);
        Ambalaza ambalaza2 = new Tetrapak("45-2","jogurt",
                120,100,false,30);
        Ambalaza ambalaza3 = new StaklenaAmbalaza("45-3","pivo",
                70,50,40,true,50);
        Ambalaza ambalaza4 = new StaklenaAmbalaza("45-4","vino",
                70,60,20,false,400);


        SuperKartica kartica1 = new SuperKartica(1009,"Aleksandra Brankovic",10);

        Korpa korpa1 = new Korpa();

        korpa1.dodajAmbalazu(ambalaza1);
        korpa1.dodajAmbalazu(ambalaza2);
        korpa1.dodajAmbalazu(ambalaza3);
        korpa1.dodajAmbalazu(ambalaza4);
        korpa1.izbaciAmbalazu("45-4");

        korpa1.cenaSaSuperKarticom(kartica1);

        korpa1.printAll();

        kartica1.printKartica();

    }
}
