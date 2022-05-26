package d_24_05_2022;

public class ZeleniKarton {

    private String student;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String profesor;
    private int ocena;

    public ZeleniKarton(String student, int brojIndeksa, String nazivPredmeta, String profesor, int ocena){
        this.student = student;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String polozenIspit(int ocena){
        if(ocena > 5)  {
            return "Ispit je polozen";
        }else{
            return "Ispit nije polozen";
        }
    }

    public void stampaj(){
        System.out.println( this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Sudent: " + this.student + ", " + " broj indeksa " + this.brojIndeksa);
        System.out.println("Profesor: " + this.profesor);
    }
}
