import java.util.Scanner;

public class Activity44 {

    /**
     * Function name: draw - depending on the input, this function will
     * prompt the user thatt there choice is being drawn
     * 
     * @param choice
     */
    public static void draw(int choice) {

        // draw a butterfly
        if (choice == 1) {
            System.out.println("Drawing a butterfly");

            System.out.println("⣠⣤⣤⡤⠤⢤⣤⣀⡀⠀⠐⠒⡄⠀⡠⠒⠀⠀⢀⣀⣤⠤⠤⣤⣤⣤⡄");
            System.out.println("⠈⠻⣿⡤⠤⡏⠀⠉⠙⠲⣄⠀⢰⢠⠃⢀⡤⠞⠋⠉⠈⢹⠤⢼⣿⠏⠀");
            System.out.println("⠀⠀⠘⣿⡅⠓⢒⡤⠤⠀⡈⠱⣄⣼⡴⠋⡀⠀⠤⢤⡒⠓⢬⣿⠃⠀⠀");
            System.out.println("⠀⠀⠀⠹⣿⣯⣐⢷⣀⣀⢤⡥⢾⣿⠷⢥⠤⣀⣀⣞⣢⣽⡿⠃⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠈⢙⣿⠝⠀⢁⠔⡨⡺⡿⡕⢔⠀⡈⠐⠹⣟⠋⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⢼⣟⢦⢶⢅⠜⢰⠃⠀⢹⡌⢢⣸⠦⠴⣿⡇⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠘⣿⣇⡬⡌⢀⡟⠀⠀⠀⢷⠀⣧⢧⣵⣿⠂⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠈⢻⠛⠋⠉⠀⠀⠀⠀⠈⠉⠙⢻⡏⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢰⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠄⠀⠀⠀⠀⠀⠀");
        }

        // draw an elephant
        else if (choice == 2) {
            System.out.println("Drawing an elephant");

            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠞⠉⠀⠀⠀⠀⠀⠉⠉⠉⠉⠑⣦⣀⣀⣀⠀⠀⢀⣀⣀⣀⣤⣤⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠟⠀⠀⠀⠀⠀⠀⠀⢆⠀⠀⢀⠴⠋⠁⠀⠀⠉⠉⠓⠺⠧⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠶⣄⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠀⠀⠀⠀⠀⠀⠀⠘⢷⡀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢠⠏⠀⠻⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣭⣵⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇");
            System.out.println("⠀⠀⠀⠀⠀⢠⡏⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⢷⣟⠀⠀⠀⠀⠀⠀⠀⠀⢸⢿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀");
            System.out.println("⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠙⢧⡀⠀⠀⠀⠀⠀⠀⣼⣼⠀⠐⠒⠉⠉⠉⠒⠄⢸⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠋⠀⠀");
            System.out.println("⠀⠀⠀⠀⢀⡇⠀⢰⠀⠀⠀⠀⠀⠀⠀⢙⢦⡀⠀⠀⠀⠀⣇⡟⠀⠀⠠⠐⠒⠒⠠⠀⢸⡏⠀⠀⠀⠀⠀⠀⣀⣤⠖⠋⠁⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠘⡇⠀⢸⡀⠀⠀⠀⠀⠀⠀⠈⡇⠙⠳⣤⣀⣠⣿⡃⠀⠀⣠⠤⠤⠤⢄⡀⠀⣷⠀⠀⠀⢀⡤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⢀⡇⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠈⠉⢸⠓⣦⠊⡀⠀⠠⠤⡀⠑⣤⣼⣀⡴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⢀⡾⣷⠀⠀⢻⡄⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⣏⡼⠻⣮⠤⠄⢀⠀⠈⣶⢿⡘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⣸⢳⢻⠀⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠸⣄⠀⠀⠀⠉⠀⠀⢳⠠⢒⣀⡀⢸⣿⠀⢳⣽⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⢀⢿⠃⢸⡇⠀⠀⠀⠻⣄⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⢸⣄⣀⣷⣷⢼⢿⠀⠀⠙⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⣤⣾⢾⡆⠀⡇⠀⠀⠀⠀⣨⣷⣤⣀⡀⠀⠀⠸⣧⠀⠀⠀⠀⠀⠘⣏⢙⣛⡃⢸⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣸⠁⠀⢠⠇⠀⣿⠀⠀⢠⠊⣼⠈⢧⠉⠛⠛⠶⠒⢻⣧⠀⠀⠀⠀⠀⣿⠋⠉⠁⢸⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠻⣧⣠⠞⠀⠀⣿⠀⠀⠀⢀⡇⠀⠈⡇⠀⠀⠀⢠⡟⠘⡇⠀⠀⠀⠀⣿⡇⠀⠀⢸⣾⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠉⠁⠀⠀⠀⣿⠀⠀⠀⣸⠃⠀⠀⢿⠀⠀⠀⣼⠁⠀⢿⠀⠀⠀⠀⣿⣷⠀⠀⢸⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⣿⠀⠀⢠⡏⠀⠀⠀⢸⡇⠀⠀⣿⠀⠀⢸⡆⠀⠀⠀⣿⣿⠀⠀⣼⣸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⡿⠀⠀⢸⠃⠀⠀⠀⢸⠁⠀⠀⢸⡄⠀⠈⡇⠀⠀⠀⢸⣿⠀⠀⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⣸⠇⠀⠀⢸⠆⠀⠀⠀⢸⠀⠀⠀⠸⡇⠀⠀⣷⠀⠀⠀⢸⡟⣇⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⢠⡟⠀⠀⠀⢸⠀⠀⠀⢀⡿⠀⠀⠀⠀⣿⠀⠀⣿⠀⠀⠀⢸⡁⠙⠚⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠻⠦⢤⣤⣤⡼⠇⠀⠀⠘⢧⣀⣀⠀⠀⠘⣷⢠⡇⠀⠀⠀⠈⢧⡤⠴⠟⠀⠀⠀⠀⠀⠀⢠⣤⣤⣤⣤⣤⣶⣶⠀⡄⣤⣄");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠈⠛⠒⠲⠿⠶⠾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠈⣉⠉⠉⠉⠉⣛⡛⠁⠉⠉⠀");
        }

        // draw a bear
        else if (choice == 3) {
            System.out.println("Drawing a bear");

            System.out.println("ʕ•ᴥ•ʔ");
        }

        // draw a snake
        else if (choice == 4) {
            System.out.println("Drawing a snake");

            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⡉⠙⣻⣷⣶⣤⣀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡿⠋⠀⠀⠀⠀⢹⣿⣿⡟⠉⠉⠉⢻⡿⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠰⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⣿⣿⣇⠀⠀⠀⠈⠇⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠉⠛⠿⣷⣤⡤⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣶⣦⣤⣤⣀⣀⣀⡀⠉⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⢀⣀⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠙⠛⠿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀");
            System.out.println("⠀⠀⣰⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣧⠀⠀");
            System.out.println("⠀⠀⣿⣿⣿⠁⠀⠈⠙⢿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⠀⠀");
            System.out.println("⠀⠀⢿⣿⣿⣆⠀⠀⠀⠀⠈⠛⠿⣿⣶⣦⡤⠴⠀⠀⠀⠀⠀⣸⣿⣿⣿⡿⠀⠀");
            System.out.println("⠀⠀⠈⢿⣿⣿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⠃⠀⠀");
            System.out.println("⠀⠀⠀⠀⠙⢿⣿⣿⣿⣶⣦⣤⣀⣀⡀⠀⠀⠀⣀⣠⣴⣾⣿⣿⣿⡿⠃⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠈⠙⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

        } else {
            System.out.println("Invalid Input! (choice)");
        }

    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Which animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly");
        System.out.println("Write 2 for elephant");
        System.out.println("Write 3 for bear");
        System.out.println("Write 4 for snake");

        try (Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

            draw(choice);
        }
    }

}
