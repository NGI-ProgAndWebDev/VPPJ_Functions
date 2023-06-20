    import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        rollDoubles();
    }
    
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    
    public static void rollDoubles() {
        int dice1, dice2;
        
        do {
            dice1 = rollDice();
            dice2 = rollDice();
            
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        } while (dice1 != dice2);
        
        System.out.println("You rolled doubles!");
    }
}


