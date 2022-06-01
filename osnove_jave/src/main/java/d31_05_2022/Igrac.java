package d31_05_2022;
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//        broj (broj koji igrac nosi)
//        poziciju koju igra (odbrambeni, napadac, … )
//        kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//        default-ni konstuktor
//        konstuktor sa parametrima
//        gettere i settere za broj, kapiten i poziciju
//        metodu stampaj, koju prepisuje iz glavne klase, tako da
//        stampa sve informacije o igracu.



public class Igrac extends Osoba {

    private int brojDresa;
    private String pozicija;
    private boolean kapiten;

    public Igrac(){
        super();
    }

    public Igrac(String imeIPrezime, String JMBG, int godinaRodjenja, int brojDresa, String pozicija,
                 boolean kapiten) {
        super(imeIPrezime, JMBG, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj dresa: " + this.getBrojDresa() + " pozicija " + this.getPozicija() + ".");
        if(isKapiten()){
            System.out.println("Gospodin je kapiten tima.");
        }else{
            System.out.println("Gospodin nije kapiten tima.");
        }
    }
}
