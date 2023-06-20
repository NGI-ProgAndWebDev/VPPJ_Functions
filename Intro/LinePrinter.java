import java.util.Scanner;

public class LinePrinter {
   
        public static void main(String[] args) {
            String line = "I will not forget semi-colons.";
    
            for (int i = 1; i <= 99; i++) {
                System.out.println(i + ". " + line);
            }
        
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the line you want to write: ");
            String line = scanner.nextLine();
    
            for (int i = 1; i <= 99; i++) {
                System.out.println(i + ". " + line);
            }
    
            scanner.close();
        }
    }

    
    

