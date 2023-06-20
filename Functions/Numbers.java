public class Numbers {
    public static void main(String[] args) {
        System.out.println("Reverse");
        printReverse();

        System.out.println("Even numbers");
        printEvenNumbers();
    }

    public static void printReverse() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void printEvenNumbers() {
        for (int i = 0; i < 21; i += 2)
            System.out.println(i);

        for (int i = 1; i < 21; i++)
            if (i % 2 == 0)
                System.out.println(i);

    }
}
