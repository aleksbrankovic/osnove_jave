package d30_05_2022;

public class IspitStudentMain {

    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Osnove ekonomije",7,"Mrdjan Djokic");
        Ispit ispit2 = new Ispit("Medjunarodna trgovina",8,"Mladjan Brankovic");
        Ispit ispit3 = new Ispit("Konstrukcije", 7,"Milos Pavlovic");
        Ispit ispit4 = new Ispit("Statistika", 9,"Milan Djordjevic");
        Ispit ispit5 = new Ispit("Resursi preduzeca",6,"Nadica Figar");


        Student student1 = new Student(1009,"Aleksandra Brankovic","osnovne");


        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);
        student1.dodajIspit(ispit3);
        student1.dodajIspit(ispit4);
        student1.dodajIspit(ispit5);

        student1.stampajNizIspita();
    }
}
