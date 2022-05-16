package d16_05_2022;
//5.   (Za vezbanje )Napisati funkciju koja za pronalazi koliko
//     ima celih brojeve izmedju brojeva M i N.
//     Primer izvrsenja:
//     izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//     izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost X: ");
        int x = s.nextInt();
        System.out.println("Unesite vrednost Y: ");
        int y = s.nextInt();

        System.out.println("Rezultat " + izbroji(x,y));
    }

    static int izbroji(int a, int b) {
        int brojac = 0;
        if(b < 0){
            brojac = a - b -1;
        }else {
            brojac = b - a - 1;
        }
        return brojac;
    }
}
