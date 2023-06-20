public class LoopingArrays {
    public static void main(String[] args) {
        int [][] studentgrades = { // creating a 2D array and populating it
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };


        for (int j =0; j <studentgrades[0].length; j++) { //(hint for homeword) for (int j = 0; j<grades[i.length; j++]){sout}
            System.out.print(studentgrades[0][j] + " ");
        }
         System.out.println("\n");

         for (int j =0; j <studentgrades[1].length; j++) {
            System.out.print(studentgrades[1][j] + " ");
         }
          System.out.println("\n"); // allows dropping line and spacing between

             for (int j =0; j <studentgrades[2].length; j++) {
            System.out.print(studentgrades[2][j] + " ");
    }
 
    }
}// homework.... figure out how to do the above using the switch expression
