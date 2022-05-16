package d16_05_2022;
//3.    Napisati metodu koja stampa podatke o korisniku u formatu:
//      JMBG: [jmbg]
//      Ime: [ime]
//      Prezime: [prezime]
//      God. rodjenja: [god]
//      Aktivan: [true/false]
//      Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.


import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite JMBG: ");
        String a = s.next();

        System.out.print("Unesite ime: ");
        String b = s.next();

        System.out.print("Unesite prezime: ");
        String c = s.next();

        System.out.print("Unesite godinu rodjenja: ");
        int d = s.nextInt();

        System.out.print("Unesite da li je korisnik aktivan: ");
        boolean e = s.nextBoolean();

        System.out.println();
        podaciKorisnika(a,b,c,d,e);

    }

    static void podaciKorisnika(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg );
        System.out.println("Ime korisnika: " + ime);
        System.out.println("Prezime korisnika: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Da li je korisnik aktivan: " + aktivan);
    }

}
