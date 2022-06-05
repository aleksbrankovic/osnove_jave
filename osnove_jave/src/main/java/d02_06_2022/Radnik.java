package d02_06_2022;
//Kreirati abstraktnu klasu Radnik koja ima:
//        ime i prezime
//        niz sektora u kojima radi
//        abstraktnu metodu koja vraca platu radnika
//        metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom



import java.util.ArrayList;

public abstract class Radnik {

    protected String imeIPrezime;
    protected ArrayList<Sektor> listaSektora = new ArrayList<>();

    public Radnik(){
    }
    public Radnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ArrayList<Sektor> getListaSektora() {
        return listaSektora;
    }

    public void setListaSektora(ArrayList<Sektor> listaSektora) {
        this.listaSektora = listaSektora;
    }

    public abstract double kolikaJePlata();

    public void zaposliUSektor(Sektor sektor) {
        listaSektora.add(sektor);
    }


}
