import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 {
    
    public static void readFile(String fileName) throws FileNotFoundException{
        
        FileInputStream fis =new FileInputStream("Greetings.txt");
        Scanner sc = new Scanner(fis);
        
        System.out.println(sc.nextLine());
        sc.close();
        
    }
    
    public static void main(String[] args) {
        try{
        
            readFile("Greetings.txt");
        
        } catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}


