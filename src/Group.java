import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private  Student [] students;
    private String programmer ;
    private LocalDate dateOfstart;

    public Group() {

    }

    public Group(Student[] students, String programmer, LocalDate dateOfstart) {
        this.students = students;
        this.programmer = programmer;
        this.dateOfstart = dateOfstart;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public LocalDate getDateOfstart() {
        return dateOfstart;
    }

    public void setDateOfstart(LocalDate dateOfstart) {
        this.dateOfstart = dateOfstart;
    }

    @Override
    public String toString() {
        return " Group: " +
                "\nstudents: " + Arrays.toString(students) +
                "\n programmer: " + programmer + '\'' +
                "\n date Of start: " + dateOfstart +
                '}';
    }
}
