package d02_06_2022;
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//        override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.


public class Menadzer extends Radnik {

    public Menadzer() {
    }

    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double kolikaJePlata() {
        double plata = 0;
        for (int i = 0; i < listaSektora.size(); i++) {
            plata = plata + listaSektora.get(i).getPlataSektora();
        }
        return plata;
    }



}
