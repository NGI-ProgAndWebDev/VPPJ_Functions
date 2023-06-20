public class Task1Repeat {
    //Task 1
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("If java were easy, they would call it Python" + (i + 1));
        }
        
    }
}
//Task 2
public class LineNumber {
    public static void numberLines(java.lang.String statement) {
        java.lang.String[] lines = statement.split("\n");

        for (int i = 0; i < lines.length; i++) {
            int lineNumber = i + 1;
            System.out.println("Line " + lineNumber + ": " + lines[i]);
        }
    }

    public static void main(String[] args) {
        java.lang.String statement = "This is line 1.\nThis is line 2.\nThis is line 3.";
        numberLines(statement);
    }
}
