import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
        
        try {
            
            FileInputStream fis = new FileInputStream("Greetings.txt");
            Scanner sc = new Scanner(fis);
            
            System.out.println(sc.nextLine());
            sc.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println(ex.getMessage());
        }
        
                
    }
    
}