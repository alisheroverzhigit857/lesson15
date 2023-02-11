import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String firstName ;
    private String lastName ;
    private  int age ;
    private  String email;

    public  Student ( ) {

    }

    public Student(String firstName, String lastName, LocalDate tuukganKunu, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void setTuukganKunu(LocalDate age ) {
        this.age = Period.between(age,LocalDate.now()).getYears();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student " +
                "\nfirstName: " + firstName + '\'' +
                "\n lastName: " + lastName + '\'' +
                "\n age: " + age +
                "\n email: " + email + '\'' +
                '}';
    }
}
