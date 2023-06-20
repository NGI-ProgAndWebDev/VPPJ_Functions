public class HwExams1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] students = { "Draco", "Crabbe", "Goyle", "Pansy", "Danny" };

        /*
         * System.out.println(TakeASeat [0]);
         * System.out.println(TakeASeat [1]);
         * System.out.println(TakeASeat [2]);
         * System.out.println(TakeASeat [3]);
         * System.out.println(TakeASeat [4]);
         * 
         * String TakeASeat0 = "Draco";
         * String TakeASeat1 = "Crabbe";
         * String TakeASeat2 = "Goyle";
         * String TakeASeat3 = "Pansy";
         * String takeASeat4 = "Danny"; //WONT RUN, WONT WORK, FINE THEN, DON'T SIT. I
         * DON'T CARE!!!
         */

        for (int i = 0; i < students.length; i++) {
            String student = students[i];
            System.out.println(students +  " , your seat number is " + i);

        }

    }
}
