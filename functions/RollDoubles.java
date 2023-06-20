import java.util.Random;

public class RollDoubles {
    public static void main(String[] args) {
        // Task 3: Roll the dice until doubles are rolled
        int dice1, dice2;
        
        do {
            // Task 2: Roll the dice and print their values
            dice1 = rollDice();
            dice2 = rollDice();
            
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        } while (dice1 != dice2);
        
        // Task 4: Print "You rolled doubles!"
        System.out.println("You rolled doubles!");
    }

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

