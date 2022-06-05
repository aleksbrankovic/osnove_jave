package d03_06_2022;
//Kreirati klasu SuperKartica koja ima:
//        broj kartice
//        ime i prezime vlasnika
//        popust (200, 500, … )
//        konstuktore (default-ni i sa parametrima)
//        gettere i settere
//        metodu stampaj koja stampa karticu u formatu:
//        (broj kartice), (ime i prezime)


public class SuperKartica {

    private int brojKartice;
    private String imeIPrezime;
    private int popust;

    public SuperKartica(){

    }

    public SuperKartica(int brojKartice, String imeIPrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezime = imeIPrezime;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void printKartica(){
        System.out.println("Broj kartice: " + this.getBrojKartice() + ", "
                + "Ime i prezime " + this.getImeIPrezime());
    }
}
