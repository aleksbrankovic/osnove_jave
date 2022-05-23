package d19_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println("{"+this.naziv+"}" + "{"+this.cena+"}" + "{"+this.tezina+"}");
    }

    public double povecajCenu(double povecanje){
        this.cena = this.cena + povecanje;
        return this.cena;
    }

    public double vratiCenuSaPopustom(double popustUProcentima){
        double popust = this.cena * (popustUProcentima/100);
        return (this.cena - popust);
    }

    public int racunajPostarinu(){
        if(tezina <= 100){
            return  200;
        }else if (tezina >=101 && tezina <= 500){
            return 400;
        }else {
            return 1000;
        }
    }


























}
