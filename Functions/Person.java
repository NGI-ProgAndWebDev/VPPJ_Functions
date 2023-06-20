import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person other) {
        this.name = other.name;
        this.nationality = other.nationality;
        this.dateOfBirth = other.dateOfBirth;
        this.seatNumber = other.seatNumber;
        this.passport = other.passport.clone();
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String[] getPassport() {
        return passport.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassport() {
        this.passport[0] = this.name;
        this.passport[1] = this.nationality;
        this.passport[2] = this.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Nationality: " + nationality + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Seat Number: " + seatNumber + "\n" +
                "Passport: " + java.util.Arrays.toString(passport) + "\n";
    }

    public static void main(String[] args) {
        Person person = new Person("Casey Spinner", "South African", "07/08/2003", 5);
        System.out.println(person);
    }
}














   