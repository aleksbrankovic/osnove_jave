package d31_05_2022;
//1.Zadatak
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        jmbg
//        godinu rodjenja
//default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere
//        metodu stampaj koja stampa u formatu:
//        (ime i prezime), (jmbg), (godina rodjenja)


public class Osoba {

    protected String imeIPrezime;
    protected String JMBG;
    protected int godinaRodjenja;

    public Osoba(){
    }

    public Osoba(String imeIPrezime, String JMBG, int godinaRodjenja){
        this.imeIPrezime = imeIPrezime;
        this.JMBG = JMBG;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj(){
        System.out.println("Osoba: " + this.getImeIPrezime() + " JMBG: " + this.getJMBG() +
                " godina rodjenja: " + this.getGodinaRodjenja());
    }
}
