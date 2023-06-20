
import java.util.Scanner;

public class IDCheck {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder ID = new StringBuilder(13);

        String dob, year, month, day, gender = "", citizenship = "", authentication = "";

        System.out.print("Enter your ID Number: ");
        ID.append(kb.next().trim());

        if (ID.length() == 13) {
            year = ID.substring(0, 2);
            month = ID.substring(2, 4);
            day = ID.substring(4, 6);
            dob = day + "/" + month + "/" + year;
            System.out.println("Date of birth: " + dob);

            int genderDigit = Integer.parseInt(ID.substring(6, 7));
            if (genderDigit >= 0 && genderDigit <= 4) {
                gender = "Female";
            } else if (genderDigit >= 5 && genderDigit <= 9) {
                gender = "Male";
            }
            System.out.println("Gender: " + gender);

            int citizenshipDigit = Integer.parseInt(ID.substring(10, 11));
            if (citizenshipDigit == 0) {
                citizenship = "SA Citizen";
            } else if (citizenshipDigit == 1) {
                citizenship = "Non SA Citizen";
            }
            System.out.println("Citizenship: " + citizenship);

            int authenticationDigit = Integer.parseInt(ID.substring(11, 12));
            if (authenticationDigit == 8) {
                authentication = "Authentic";
            } else if (authenticationDigit == 9) {
                authentication = "Please ensure that you have a letter confirming authentication of your ID document from Home Affairs";
            }
            System.out.println("Authentication: " + authentication);
        } else {
            System.out.println("Invalid ID length.");
        }
    }
}



