import java.util.Scanner;

public class ActivityDraw {
    public static void main(String[] args) {
        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant ");
        System.out.println("Write 3 for bear ");
        System.out.println("Write 4 for snake ");

        Scanner sc = new Scanner(System.in);
        String animal = sc.nextLine().toLowerCase();
        sc.close();

        switch (animal) {
            case "1":
                System.out.println(" //\\         /\\\\");
                System.out.println("|| * \\ . . / * ||");
                System.out.println(" \\\\____\\X/____//");
                System.out.println("  / *  /O\\  * \\");
                System.out.println("  \\___/   \\___/");
                break;
            case "2":
                System.out.println("                         ____");
                System.out.println("                   .---'-    \\");
                System.out.println("      .-----------/           \\");
                System.out.println("     /           (         ^  |   __");
                System.out.println("&   (             \\        O  /  / .'");
                System.out.println("'._/(              '-'  (.   (_.' /");
                System.out.println("    \\                    \\     ./");
                System.out.println("     |    |       |    |/ '._.'");
                System.out.println("     )   @).____\\|  @ |");
                System.out.println(" .  /    /       (    | mrf");
                System.out.println("  \\|, '_:::\\  . ..  '_:::\\ ..\\).");
                break;
            case "3":
                System.out.println("     __         __");
                System.out.println("    /  \\.-\"\"\"-./  \\");
                System.out.println("    \\    -   -    /");
                System.out.println("     |   o   o   |");
                System.out.println("     \\  .-'''-.  /");
                System.out.println("      '-\\__Y__/-'");
                System.out.println("         `---`");
                break;
            case "4":
                System.out.println("             ____");
                System.out.println("            / . .\\");
                System.out.println("MT          \\  ---<");
                System.out.println("             \\  /");
                System.out.println("   __________/ /");
                System.out.println("-=:___________/");
                break;
            default:
                break;
        }
    }

}
