import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Malik");
        student.setLastName("Turatbekov");
        student.setTuukganKunu(LocalDate.of(2004,12,4));
        student.setEmail("turatbekov@gmail.com");

        Student student1 = new Student();
        student1.setFirstName("Baiel");
        student1.setLastName("Momunov");
        student1.setTuukganKunu(LocalDate.of(2004,9,4));
        student1.setEmail("momunov@gmail.com");

        Student student2 = new Student();
        student2.setFirstName("Erzhigit");
        student2.setLastName("Alisherov");
        student2.setTuukganKunu(LocalDate.of(2004,2,17));
        student2.setEmail("alisherov@gmail.com");
        Student [] students = {student, student1, student2};

        Group group = new Group();
        group.setDateOfstart(LocalDate.of(2023,01,03));
        group.setProgrammer("Backendshk: ");
        group.setStudents(students);
        Group [] groups = {group};

        Kurs kurs = new Kurs();
        kurs.setKursName("Java");
        kurs.setKursNumber(9);
        kurs.setNameMentor("Datka");
        kurs.setGruppas(groups);
        System.out.println(kurs.toString());

    }
}


