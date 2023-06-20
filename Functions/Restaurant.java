public class Restaurant {
            public static void main(String[] args) {
            double billAmount = 53.50;
    
            // Create an instance of the Restaurant class
            Restaurant restaurant = new Restaurant();
    
            // Call the tipTheWaiter function
            restaurant.tipTheWaiter(billAmount);
        }
    
        /**
         * Function name: tipTheWaiter
         * Calculates a tip and prints it.
         * @param bill (double)
         *
         * Inside the function:
         * 1. Calculates a tip that's 15 percent of the bill you paid.
         * 2. Prints: your service was wonderful! Please, accept this tip: $<tip>
         */
        public void tipTheWaiter(double bill) {
            double tip = bill * 0.15; // Calculate the tip amount
    
            System.out.println("Thank you! Your service was wonderful! Please, accept this tip:: $" + tip);
            
        }
    }
    