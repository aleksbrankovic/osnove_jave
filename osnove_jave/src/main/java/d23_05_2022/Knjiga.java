package d23_05_2022;

public class Knjiga {

    private String ISBN;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(String ISBN, String naziv, int godinaIzdanja, Autor autor){
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj(){
        System.out.println("Broj knjige je: " + this.ISBN);
        System.out.println("Naziv knjige je: " + this.naziv + " - " + " godina izdanja " + this.godinaIzdanja);
        System.out.println("Ime autora je " + this.getAutor().getImeAutora() + ", " + "prezime autora je " +
                this.getAutor().getPrezimeAutora());
    }




}
