import java.util.Scanner;

public class ActivityFourFour {
    

    public static  void draw() {
        String animal ; 
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly");
        System.out.println("Write 2 for elephant");
        System.out.println("Write 3 for bear");
        System.out.println("Write 4 for snake");
        animal = scan.nextLine();


        if(animal.equals("1")){
            System.out.println("          x            x        ");
            System.out.println("            x        x          ");
            System.out.println("              x    x            ");
            System.out.println("        xxxx    xx    xxxx      ");
            System.out.println("      x         xx x      x     ");
            System.out.println("      x         xx         x    ");
            System.out.println("       xxxxxx   xx   xxxxxx     ");
            System.out.println("            x   xx   x          ");
            System.out.println("        x     x xx x    x       ");
            System.out.println("      x     x   xx   x     x    ");
            System.out.println("       x  x             x  x    ");
        }
        else if (animal.equals("2")){
            System.out.println("     xxxx                xxxx               ");
            System.out.println("   xxxxxxxx            xxxxxxxx                   ");
            System.out.println("  xxxxxxxxxx x  x x x xxxxxxxxxx                         ");
            System.out.println("   xxxxxxxx x        x  xxxxxxxx                        ");
            System.out.println("  xxxxxxxx x           x  xxxxxxxx                       ");
            System.out.println("  xxxxxxx  x           x   xxxxxxx                    ");
            System.out.println("  xxxxxxxx x    xxx    x   xxxxxxx                            ");
            System.out.println("   xxxxxxx x    xxx    x   xxxxxx                     ");
            System.out.println("             x  xxx   x                             ");
            System.out.println("                xxx   xxx                        ");
            System.out.println("                xxx  xxx              ");
            System.out.println("                  xxx                    ");
        }
        else if (animal.equals("3")){
            System.out.println("       xxxxxx                   xxxxxx                         ");
            System.out.println("      xx     xx                xx    xx                                 ");
            System.out.println("      xxxxxxxx  x  x  x  x   x xxxxxxxx                               ");
            System.out.println("            x                  x                       ");
            System.out.println("            x                   x                    ");
            System.out.println("            x       xxxxx       x              ");
            System.out.println("            x        xxx        x                 ");
            System.out.println("            x         xx        x              ");
            System.out.println("              x                x     ");
            System.out.println("                x   x  x  x  x                             ");
            System.out.println("                                                   ");

        }
        else if (animal.equals("4")){
            System.out.println("             xx            ");
            System.out.println("            xxxx             ");
            System.out.println("           xxxxxx             ");
            System.out.println("            xxxx            ");
            System.out.println("             xxxx                ");
            System.out.println("               xxxx              ");
            System.out.println("                xxxx                 ");
            System.out.println("               xxxx                    ");
            System.out.println("              xxxx                                ");
            System.out.println("            xxxx                              ");
            System.out.println("              xxxx                            ");
            System.out.println("                xxxx   xx                  ");
            System.out.println("                  xx  xx                    ");
            System.out.println("                   xx                              ");
            System.out.println("                                          ");
        }
        
    }
    public static void main(String[] args) {
        draw();
    }
    
}
