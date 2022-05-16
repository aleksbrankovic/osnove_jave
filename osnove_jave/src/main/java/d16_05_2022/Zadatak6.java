package d16_05_2022;
//6.      Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost za X: ");
        int x = s.nextInt();

        System.out.print("Unesite vrednost za Y: ");
        int y = s.nextInt();

        System.out.print("Unesite vrednost za Z: ");
        int z = s.nextInt();

        System.out.println("Najmanji od unetih brojeva je: " + najmanjiBroj(x,y,z) + ".");

    }

    static int najmanjiBroj(int a, int b, int c) {
        int minBroj = 0;
        if(a<b && a>c){
            minBroj= a;
        }else if (b<a && b<c){
            minBroj=b;
        }else {
            minBroj = c;
        }
        return minBroj;
    }
}
