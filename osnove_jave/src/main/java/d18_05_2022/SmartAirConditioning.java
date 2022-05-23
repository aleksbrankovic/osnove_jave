package d18_05_2022;
// 2.     Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning
//        i za svaki od njih pozvati metodu za stampu


public class SmartAirConditioning {

    public String marka;
    public int temperatura;
    public boolean greje = true;


    public static void stampaj (String marka, int temperatura, boolean greje) {
        if(greje){
            System.out.println("Marka klime " + marka + " temperature " + temperatura + " greje ");
        }else{
            System.out.println("Marka klime " + marka + " temperature " + temperatura + " ne greje ");
        }
    }




}
