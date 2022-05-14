package d13_05_2022;
//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
// Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//        Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
//        ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje,
//        vodite racuna da ne izadjete van opsega niza)
//        Za racunanje sume, nije potrebna petlja!
//Primer izvrsenja:
//        2,4,6,7,4,
//        4,2,5,1,4,
//        1,4,9,4,5,
//        4,8,5,4,7,
//        4,4,7,4,1,
//        Unesite poziciju: 12
//        Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku).


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        for (int i = 0; i < 25; i++) {
            int randomBroj = random.nextInt(10);
            nizBrojeva.add(randomBroj);
        }

        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite zeljenu poziciju: ");
        int unetaPozicija = s.nextInt();

        int levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
        int desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
        int pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
        int pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);

        if (nizBrojeva.get(unetaPozicija) == unetaPozicija || nizBrojeva.get(unetaPozicija) > 4
                || nizBrojeva.get(unetaPozicija) <= 20 || unetaPozicija % 5 != 0 ||
                unetaPozicija % 5 != 4) {
            int suma = (nizBrojeva.get(unetaPozicija) + levoOdPozicije + desnoOdPozicije
                    + pozicijaIznad + pozicijaIspod);
            System.out.println("Suma brojeva je: " + suma);
        }


    }
}
