package d02_06_2022;
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//        ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//        suma plata svih sektor / broj sektora * 0.5
//        override uje metodu za platu, tako da se plata racuna po formuli:
//        (prosecna plata za sve sektore u kojima radi) * (broj sektora).


public class Magacioner extends Radnik{

    public Magacioner() {
    }

    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }

    private double prosecnaMesecnaPlata () {
        double zbirPlataPoSektorima = 0;
        for (int i = 0; i < listaSektora.size(); i++) {
            zbirPlataPoSektorima = zbirPlataPoSektorima + listaSektora.get(i).getPlataSektora();
        }
        return (zbirPlataPoSektorima / listaSektora.size()) * 0.5;
    }

    @Override
    public double kolikaJePlata() {
        return prosecnaMesecnaPlata() * listaSektora.size();
    }


}
