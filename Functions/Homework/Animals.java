import java.util.Scanner;

public class Animals {
    
    public static void draw() {
        String animal ; 
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nWich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant ");
        System.out.println("Write 3 for bear ");
        System.out.println("Write 4 for snake ");
            animal = scan.nextLine();

        if(animal.equals("1")){

            System.out.println("*         *");
            System.out.println("**       **");
            System.out.println("***     ***");
            System.out.println("****   ****");
            System.out.println("***** *****");
            System.out.println("***********");
            System.out.println("***** *****");
            System.out.println("****  *****");
            System.out.println("***     ***");
            System.out.println("**       **");
            System.out.println("*         *");
    }
    

    }
}
