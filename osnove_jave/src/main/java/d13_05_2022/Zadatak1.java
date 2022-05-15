package d13_05_2022;
//Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//      Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//      Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad,
//      ispod, s leve i s desne strane tog elementa (Ukoliko ti elementi postoje,
//      vodite racuna da ne izadjete van opsega niza)
//      Za racunanje sume, nije potrebna petlja!
//      Primer izvrsenja:
//        2,4,6,7,4,
//        4,2,5,1,4,
//        1,4,9,4,5,
//        4,8,5,4,7,
//        4,4,7,4,1,
//       Unesite poziciju: 12
//       Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku).


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
        System.out.println("Unesite zeljenu poziciju: ");
        int unetaPozicija = s.nextInt();

        int levoOdPozicije = 0;
        int desnoOdPozicije = 0;
        int pozicijaIznad = 0;
        int pozicijaIspod = 0;

        if (unetaPozicija == 5 || unetaPozicija == 10 || unetaPozicija == 15) {
            levoOdPozicije = 0;
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
        } else if (unetaPozicija == 0) {
            levoOdPozicije = 0;
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
            pozicijaIznad = 0;
        } else if (unetaPozicija == 20) {
            levoOdPozicije = 0;
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = 0;
        } else if (unetaPozicija == 4) {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = 0;
            pozicijaIznad = 0;
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
        } else if (unetaPozicija == 24) {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = 0;
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = 0;
        } else if (unetaPozicija == 1 || unetaPozicija == 2 || unetaPozicija == 3) {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIznad = 0;
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
        } else if (unetaPozicija == 9 || unetaPozicija == 14 || unetaPozicija == 19) {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = 0;
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
        } else if (unetaPozicija == 21 || unetaPozicija == 22 || unetaPozicija == 23) {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = 0;
        } else {
            levoOdPozicije = nizBrojeva.get(unetaPozicija - 1);
            desnoOdPozicije = nizBrojeva.get(unetaPozicija + 1);
            pozicijaIznad = nizBrojeva.get(unetaPozicija - 5);
            pozicijaIspod = nizBrojeva.get(unetaPozicija + 5);
        }

        int suma = (nizBrojeva.get(unetaPozicija) + levoOdPozicije + desnoOdPozicije + pozicijaIznad + pozicijaIspod);
        System.out.println("Suma brojeva je: " + suma);
    }
}
