public class Exams {
    
    public static void main(String[] args) {
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        System.out.println(">>: It's time to take your 5th year exams. Please, take your seats.");
System.out.println(">>:");

for (int i = 0; i < students.length; i++) {
    String student = students[i];
    System.out.println(">>: " + student + ", you will take seat " + i);
}

    }
}
