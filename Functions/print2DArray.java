public class print2DArray {
         public static void main(String[] args) {
        int[][] array = {
            {48, 56, 56, 76, 0, 81, 51, 81, 99, 70},
            {38, 52, 73, 6, 10, 56, 1, 71, 47, 9},
            {85, 35, 47, 98, 91, 25, 69, 52, 2, 93}
        };

        // Task 3: Create a 2D array with 100 rows and 10 columns
        int[][] newArray = new int[100][10];

        // Task 4: Populate the array with random numbers
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = randomNumber();
            }
        }

        print2DArray(array);
        System.out.println("--------------------");
        print2DArray(newArray);
    }

    public static int randomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
