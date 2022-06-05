package d03_06_2022;
//Kreirati klasu Korpa koja ima:
//        niz ambalaza
//        metodu dodaj ambalazu
//        metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase
//        (String) koju treba izbaciti
//        privatnu metodu koja vraca cenu svih ambalaza sa popustom
//        , metoda kao parametar prima popust.
//        metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//        kao parametar funkcije prima Super karticu iz koje se cita popust.

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

    public void dodajAmbalazu(Ambalaza ambalaza){
        nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if(nizAmbalaza.get(i).getBarKod().equals(barkod)){
                nizAmbalaza.remove(i);
            }

        }
    }

    private double cenaSaPopustom(int popust){
        double cenaSaPopustom = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            cenaSaPopustom = cenaSaPopustom + nizAmbalaza.get(i).cenaArtikla();
        }
        return cenaSaPopustom - (cenaSaPopustom * (popust / 100));
    }

    public double cenaSaSuperKarticom(SuperKartica superKartica){
        return cenaSaPopustom(superKartica.getPopust());
    }

    public void printAll(){
        System.out.println("Korpa: ");
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            nizAmbalaza.get(i).print();
        }
        System.out.println();
    }

}
