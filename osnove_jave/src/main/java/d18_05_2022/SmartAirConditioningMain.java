package d18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning klima1 = new SmartAirConditioning();

        klima1.marka = "Gorenje";
        klima1.temperatura = 22;
        klima1.greje = true;

        SmartAirConditioning.stampaj(klima1.marka, klima1.temperatura, klima1.greje);
        System.out.println();

        SmartAirConditioning klima2 = new SmartAirConditioning();

        klima2.marka = "Sony";
        klima2.temperatura = 20;
        klima2.greje = false;

        SmartAirConditioning.stampaj(klima2.marka, klima2.temperatura, klima2.greje);





    }
}
