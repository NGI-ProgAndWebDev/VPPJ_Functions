public class DiceJack {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int roll1 = rollDice();
            int roll2 = rollDice();
            int roll3 = rollDice();
    
            System.out.print("Enter 3 numbers between 1 and 6 ----");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
    
                if(areLessThanOne(num1,num2,num3) || areHigherThanSix(num1, num2, num3)){
                    System.out.println("You entered numbers outside the valid range");
                    System.exit(0);
                }
    
                int sumOfNumbers = num1+num2+num3;
                int sumOfDiceRolls = roll1+roll2+roll3;
    
                System.out.println("Your sum is: " +sumOfNumbers +" Computer sum is: "+ sumOfDiceRolls);
    
                if (userWon(sumOfNumbers, sumOfDiceRolls)) {
                    System.out.println("Congratulations, you are the WINNER");
                     } else {
                        System.out.println("Better Luck Next time");
                     }       
    
            scanner.close();
    
            System.out.println(roll1);
            System.out.println(roll2);
            System.out.println(roll3);
            
        }
    /**
     * Function Name: areLessThanOne
     * number 1 is less than 1 OR number 2 is less than 1 OR num3 is less than1
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
        public static boolean areLessThanOne(int num1, int num2, int num3){
            return (num1 < 1 || num2 < 1 || num3 < 1);
        }
    
        public static boolean areHigherThanSix(int num1, int num2, int num3){
            return (num1 > 6 || num2 > 6 || num3 >6);
        }
    
        public static boolean userWon(int sumNumbers, int sumDiceRolls) {
            return (sumNumbers < sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
        }
    
        public static int rollDice(){
                                    //0-0.999999999999999
            double randomNumber = Math.random()*6; // 0-5.9999999999999
            randomNumber += 1;//1-6.99999999999999
            return (int)randomNumber;
        }
    }
    
    //Rules: 1 The user needs to pick three numbers ( 4 3 5) sum is 12
    // 2 The user needs to roll the dice three times ( 3 4 4) sum is 11
    // The user wins if: 1 the sum of the dice rolls is smaller than the sum of the numbers you choose
    // 2 AND the difference between the numbers is less than 3
    
    // Task 1- roll the dice
    // Task 2 - check if the user won
    // (hint - 2 tasks implies 2 functions)
}
