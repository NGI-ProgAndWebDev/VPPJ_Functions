public class Draw {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        System.out.println("Which animal would you like to draw?");
        System.out.println("Write 1 for butterfly");
        System.out.println("Write 2 for elephant");
        System.out.println("Write 3 for bear");
        System.out.println("Write 4 for snake");

        int choice = scanner.nextInt();

        draw(choice);
    }

    public static void draw(int choice) {
        switch (choice) {
            case 1:
                drawButterfly();
                break;
            case 2:
                drawElephant();
                break;
            case 3:
                drawBear();
                break;
            case 4:
                drawSnake();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void drawButterfly() {
        System.out.println("  .==-.                   .-==.  ");
        System.out.println("   \\()8`-._  `.   .'  _.-'8()/  ");
        System.out.println("   (88\"   ::.  \\./  .::   \"88)  ");
        System.out.println("    \\_.'`-::::.(#).::::-'`._/   ");
        System.out.println("      `._... .q(_)p. ..._.'      ");
        System.out.println("        \"\"-..-'|=|`-..-\"\"         ");
        System.out.println("        .\"\"' .'|=|`. `\"\".         ");
        System.out.println("      ,':8(o)./|=|\\.(o)8:`.       ");
        System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
        System.out.println("      \\O `::/       \\::' O/       ");
        System.out.println("       \"\"--'         `--\"\"        ");
    }

    public static void drawElephant() {
        System.out.println("   _..--\"\"-.                  .-\"\"--.._ ");
        System.out.println(" .'          '.  .----.  .'          '. ");
        System.out.println("/              \\/      \\/              \\");
        System.out.println("|  .\\.   \\_/   |        |   \\_/   ./  |");
        System.out.println("\\  \\_\\_\\_\\_  ./          \\  ./  _/_/_/  /");
        System.out.println(" '.   \\_\\_\\/  .            .  \\/_/_/   '");
        System.out.println("   '-._  \\\"`  .              .  `\"/  _.-'");
        System.out.println("       '-.\"   .                .  \"/               ");
        System.out.println("          '\"--..______..--'\"'");
    }

    public static void drawBear() {
        System.out.println("       ___   .--. ");
        System.out.println("      .'   `\\/ .-.\\");
        System.out.println("     /       '|'-' \\");
        System.out.println("    |            \\ /");
        System.out.println("     \\           |('");
        System.out.println("      '\\          /\\`-.");
        System.out.println("        '._     .' .--'");
        System.out.println("           `\"\"`\\'-'\\");
        System.out.println("                `\"");
    }

    public static void drawSnake() {
        System.out.println("            ___");
        System.out.println("       __H_/  . -.");
        System.out.println("      /__H/   .  .\\");
        System.out.println("     /   /  .      \\");
        System.out.println("    /__ / .        \\__");
        System.out.println("   /   /   .        \\_\\");
        System.out.println("  /__ / .   .       / _\\");
        System.out.println(" /   /   .         /   \\");
        System.out.println("/__ /   .          \\__ \\");
        System.out.println("   /  .            /   \\");
        System.out.println("  /  .             \\__ /");
        System.out.println(" /  .               /  \\");
        System.out.println("/  .                \\__/");
        System.out.println(".                    .");
        System.out.println(".                    .");
        System.out.println(".                    .");
        System.out.println(".                    .");
    }

    @Override
    public String toString() {
        return "Draw []";
    }
}

