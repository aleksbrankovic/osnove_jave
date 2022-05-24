package d23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {

        Autor autorJedan = new Autor("Knut", "Hamsun");
        Knjiga knjigaJedan = new Knjiga("9782824906119", "Plodovi zemlje",
                1917,autorJedan);


        Autor autorDva = new Autor("Mesa", "Selimovic");
        Knjiga knjigaDva = new Knjiga("9788621001064", "Tvrdjava", 1970, autorDva);



        knjigaJedan.stampaj();
        System.out.println();
        knjigaDva.stampaj();

    }
}
