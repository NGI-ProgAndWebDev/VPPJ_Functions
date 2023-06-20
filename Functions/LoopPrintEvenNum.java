public class LoopPrintEvenNum {
 
    public static void main(String[] args) {

        //// print number 1 to 10

        for (int i = 1; i < 10; i++) {

            System.out.println(i);

        }

        System.out.println( "___________________________\n");




        //// print hello world 5 times




        for (int i = 0; i < 5; i++) {

            System.out.println("Hello World!");

        }

        System.out.println( "___________________________\n");




        //// 5 times table

        System.out.println("Five X Table");

        for (int i = 1; i < 11; i++) {

            System.out.println(i + " :" + i * 5);

        }

        System.out.println( "___________________________\n");




        // print numbers from 10 to 1

        for (int i = 10; i > 0; i--) {

            System.out.println(i);

        }

        System.out.println( "___________________________\n");




        // prints the first 10 even numbers




        for (int i = 0; i < 19; i+=2) {

            System.out.println(i);

        }

        System.out.println( "___________________________\n");




//alternate for code above

        for (int i=1; i <= 10; i++) {

            System.out.println(i * 2);

        }

        System.out.println("______________________________\n");

    }

}
