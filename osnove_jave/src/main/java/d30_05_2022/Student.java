package d30_05_2022;
//Napisati klasu Student koja ima
//        broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        Prosecna ocena: (prosecna ocena)


import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;

    private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

    public Student(){
    }

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija){
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

    public void dodajIspit(Ispit ispit){
        this.nizIspita.add(ispit);
    }

    private double prosecnaOcena(){
        double prosecnaOcena = 0;
        double zbirOcena = 0;
        int brojacPolozenihIspita = 0;
        for (int i = 0; i < nizIspita.size(); i++) {
            if (this.nizIspita.get(i).daLiJeIspitPolozen()) {
                zbirOcena = zbirOcena + this.nizIspita.get(i).getOcena();
                brojacPolozenihIspita++;
            }
        }
        prosecnaOcena = zbirOcena / brojacPolozenihIspita;
        double roundProsecnaOcena = Math.round(prosecnaOcena * 100.0) / 100.0;
        return roundProsecnaOcena;
    }

    public void stampajNizIspita(){
        System.out.println(this.getBrojIndeksa() + " - " + this.getImeIPrezime() + " - " + this.getTipStudija());
        System.out.println();
        System.out.println("Predmeti: ");
        for (int i = 0; i < nizIspita.size(); i++) {
                   this.nizIspita.get(i).print();
        }
        System.out.println();
        System.out.println("Prosecna ocena: " + this.prosecnaOcena());
    }


}
