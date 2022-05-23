package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost prvi = new FacebookPost();
        prvi.korisnikObjava = "Aleksandra Brankovic";
        prvi.tudjiProfil = "Jovan Jovanovic";
        prvi.tekstObjave = "Zdravo!";
        prvi.brojLajkova = 5;
        prvi.brojDeljenja = 4;
        prvi.povecanjeLajkova();
        prvi.smanjenjeLajkova();
        prvi.deljenje();
        prvi.stampaj();


        FacebookPost drugi = new FacebookPost();
        drugi.korisnikObjava = "Aleksandra Brankovic";
        drugi.tudjiProfil = "Jovan Jovanovic";
        drugi.tekstObjave = "Cao!";
        drugi.brojLajkova = 5;
        drugi.brojDeljenja = 3;
        drugi.povecanjeLajkova();
        drugi.smanjenjeLajkova();
        drugi.stampaj();


    }
}
