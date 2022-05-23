package d20_05_2022;

public class FacebookPost {

   public String korisnikObjava;
   public String tudjiProfil;
   public String tekstObjave;
   public int brojLajkova;
   public int brojDeljenja;

   public FacebookPost(){

   }

   public FacebookPost (String korisnikObjava, String tudjiProfil, String tekstObjave) {
       this.korisnikObjava = korisnikObjava;;
       this.tudjiProfil = tudjiProfil;
       this.tekstObjave = tekstObjave;

   }

   public void povecanjeLajkova(){
       this.brojLajkova = this.brojLajkova + 1;
   }

   public void smanjenjeLajkova(){
       if(this.brojLajkova < 0) {
           this.brojLajkova = 0;
       }else{
           this.brojLajkova = this.brojLajkova - 1;
       }
   }

   public int deljenje(){
       return this.brojDeljenja + 1;
   }

   public void stampaj(){
       System.out.println(this.korisnikObjava + " to " + this.tudjiProfil);
       System.out.println(this.tekstObjave);
       System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
   }




}
