public class ExamTaker2 {
            public static void main(String[] args) {
            String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
            int[] scores = {85, 92, 78, 88, 95};
            
            System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
            
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i] + ", you will take seat " + i);
            }
            
            int highestScore = scores[0];
            int seat = 0;
            
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > highestScore) {
                    highestScore = scores[i];
                    seat = i;
                }
            }
            
            System.out.println("\nThe highest score is " + highestScore + ".");
            System.out.println("The seat number of the student with the highest score is " + seat + ".");
        }
    }
    

