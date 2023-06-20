import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4]; // Declare a 2D array with 3 rows and 4 columns
        
        // Assign grades to each student and each subject using array indexing
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 95;
        grades[1][1] = 98;
        grades[1][2] = 99;
        grades[1][3] = 100;

        grades[2][0] = 65;
        grades[2][1] = 64;
        grades[2][2] = 61;
        grades[2][3] = 67;

        // Print the grades for each student using array indexing
        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tHermione: " + Arrays.toString(grades[1]));
        System.out.println("\tRon: " + Arrays.toString(grades[2]));
    }
}

