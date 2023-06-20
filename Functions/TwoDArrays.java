import java.util.Arrays;

public class TwoDArrays { //To store table of data
    public static void main(String[] args) {
       int [] [] grades = new int[3][4];
       //1st bracket is number of rows
       //2nd bracket is number of elements in each row

       //Harry is the 1st student (row 1 = index 0)
       grades[0][0] = 72;
       grades[0][1] = 74;
       grades[0][2] = 78;
       grades[0][3] = 76;

       //Hermoinioe is the 2nd student (row 2)
       grades[1][0] = 95;
       grades[1][1] = 98;
       grades[1][2] = 99;
       grades[1][3] = 100;

       //Ron is the 3rd student(row 3)
       grades[2][0] = 65;
       grades[2][1] = 64;
       grades[2][2] = 61;
       grades[2][3] = 67;

       System.out.println("\tHarry:" + grades[0][0] + "" + grades[0][1] + "" + grades[0][2] +"" + grades[0][3]);

       System.out.println("\tHermoione: " + Arrays.toString(grades[1]));
        System.out.println("\tRon: " + Arrays.toString(grades[2]));
    }
}// the faster way
/*int [][] grades = {
    {72, 74, 78, 76},
    {95, 98, 99, 100},
    {65, 64, 61, 67}
};
 * System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tHermoione: " + Arrays.toString(grades[1]));
        System.out.println("\tRon: " + Array.toString(grades[2]))"

    



    }
}
*/