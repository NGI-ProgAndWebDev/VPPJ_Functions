public class Immutable {
   
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            
            int apples = 5; //4 bytes
            Integer applesWrapper = 5 ; //16 bytes
    
            System.out.println(apples);
            System.out.println(applesWrapper);
    
            long stars = 1_000_000_000_000L; //8 bytes
            Long starsWrapper = 1_000_000_000_000L; //24 bytes
    
            System.out.println(stars);
            System.out.println(starsWrapper);
    
            double decimal = 1.25; //8 bytes
            Double decimalWrapper = 1.25; //24 bytes
    
            System.out.println(decimal);
            System.out.println(decimalWrapper);
    
            boolean bool = true; //1 bit
            Boolean boolWrapper = true; //16 bytes
    
            System.out.println(bool);
            System.out.println(boolWrapper);
    
            char letter = 'a'; //1 bit
            Character letterWrapper = 'a'; //16 bit
    
            System.out.println(letter);
            System.out.println(letterWrapper);
    
        }
        
    }

