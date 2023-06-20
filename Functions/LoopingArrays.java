public class LoopingArrays {
    public static void main(String[] args) {
        int[][] studentgrades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        // Iterate over the elements of the first row of studentgrades
        for (int j = 0; j < studentgrades[0].length; j++) {
            System.out.print(studentgrades[0][j] + " ");
        }
        System.out.println("\n");

        // Iterate over the elements of the second row of studentgrades
        for (int j = 0; j < studentgrades[1].length; j++) {
            System.out.print(studentgrades[1][j] + " ");
        }
        System.out.println("\n");

        // Iterate over the elements of the third row of studentgrades
        for (int j = 0; j < studentgrades[2].length; j++) {
            System.out.print(studentgrades[2][j] + " ");
        }
    }
}

