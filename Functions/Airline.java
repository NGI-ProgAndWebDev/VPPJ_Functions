import java.util.Arrays;

public class Airline {
   private Person[] people;

    public Airline() {
        this.people = new Person[11];
    }

    public Person getPerson(int index) {
        return people[index];
    }

    public void setPerson(Person person) {
        int seatNumber = person.getSeatNumber();
        people[seatNumber - 1] = person;
    }

    public void createReservation(Person person) {
        int index = person.getSeatNumber() - 1;
        
        while (people[index] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber()
                    + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
            index = person.getSeatNumber() - 1;
        }

        people[index] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }

    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 10)
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            boolean passportApproved = people[i].applyPassport();

            if (passportApproved) {
                people[i].updatePassport();
                airline.createReservation(people[i]);
            } else {
                System.out.println("Sorry " + people[i].getName() + ". Your passport: " + Arrays.toString(people[i].getPassport()) + " is not valid.\n");
            }
        }
    }
}

