package d_24_05_2022;

import java.util.ArrayList;

public class ZeleniKartonMain {
    public static void main(String[] args) {

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton prviIspit = new ZeleniKarton("Aleksandra Brankovic",1009,
                "Statistika","Miodrag Pavlovic", 9);

        ZeleniKarton drugiIspit = new ZeleniKarton("Maja Markovic",1029,
                "Matematika","Stevan Stevanovic", 7);

        ZeleniKarton treciIspit = new ZeleniKarton("Marko Nikolic",1108,
                "Istorija","Miodrag Pavlovic", 10);

        ZeleniKarton cetvrtiIspit = new ZeleniKarton("Ivan Stojanovic",1205,
                "Engleski","Nikola Jovanovic", 8);

        ZeleniKarton petiIspit = new ZeleniKarton("Milena Zdravkovic",1023,
                "Srpski","Stevan Stevanovic", 6);

        ZeleniKarton sestiIspit = new ZeleniKarton("Nikola Paunkovic",1041,
                "Poznavanje prirode","Miodrag Pavlovic", 10);

        ZeleniKarton sedmiIspit = new ZeleniKarton("Andrija Nocic",1012,
                "Statika","Miodrag Pavlovic", 9);

        ZeleniKarton osmiIspit = new ZeleniKarton("Mladjan Brankovic",1129,
                "Francuski","Stevan Stevanovic", 8);

        ZeleniKarton devetiIspit = new ZeleniKarton("Tijana Trajkov",1026,
                "Obligaciono pravo","Nikola Jovanovic", 7);

        ZeleniKarton desetiIspit = new ZeleniKarton("Nevena Uzelac",1045,
                "Kartografija","Miodrag Pavlovic", 4);

        ispiti.add(prviIspit);
        ispiti.add(drugiIspit);
        ispiti.add(treciIspit);
        ispiti.add(cetvrtiIspit);
        ispiti.add(petiIspit);
        ispiti.add(sestiIspit);
        ispiti.add(sedmiIspit);
        ispiti.add(osmiIspit);
        ispiti.add(devetiIspit);
        ispiti.add(desetiIspit);

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
        }




    }

}
