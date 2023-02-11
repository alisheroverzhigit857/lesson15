import java.util.Arrays;

public class Kurs {
    private String kursName;
    private int kursNumber;
    private String nameMentor ;
    private Group[] gruppas ;

    public  Kurs () {

    }

    public Kurs(String kursName, int kursNumber, String nameMentor, Group[] gruppas) {
        this.kursName = kursName;
        this.kursNumber = kursNumber;
        this.nameMentor = nameMentor;
        this.gruppas = gruppas;

    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public int getKursNumber() {
        return kursNumber;
    }

    public void setKursNumber(int kursNumber) {
        this.kursNumber = kursNumber;
    }

    public String getNameMentor() {
        return nameMentor;
    }

    public void setNameMentor(String nameMentor) {
        this.nameMentor = nameMentor;
    }

    public Group[] getGruppas() {
        return gruppas;
    }

    public void setGruppas(Group[] gruppas) {
        this.gruppas = gruppas;
    }

    @Override
    public String toString() {
        return "Kurs " +
                "\nkursName: " + kursName + '\'' +
                "\n kursNumber: " + kursNumber +
                "\n nameMentor: '" + nameMentor + '\'' +
                "\n gruppas: " + Arrays.toString(gruppas) +
                '}';
    }
}
