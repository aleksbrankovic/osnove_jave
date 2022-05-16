package d16_05_2022;
//1.      Napisati metodu stampajVrednostZa10Vecu u kojoj
//        se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.


import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite neki broj: ");
            int x = s.nextInt();

            System.out.print("Nova vrednost za 10 veca je: ");
            stampajVrednostZa10Vecu(x);
        }
    }

    static void stampajVrednostZa10Vecu(int a){
            System.out.println(a+10);
    }
}
