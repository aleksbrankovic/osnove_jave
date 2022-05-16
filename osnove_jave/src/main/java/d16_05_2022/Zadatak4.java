package d16_05_2022;
//4.  Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//    Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
//    / / / / /

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost za n: ");
        int n = s.nextInt();
        System.out.print("Unesite karakter: ");
        String k = s.next();
        System.out.print("Dobijen niz za vrednosti je: ");
        vrednosti(n,k);

    }

    static void vrednosti (int n, String karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);
        }


    }


}
