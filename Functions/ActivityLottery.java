import java.util.Arrays;

public class ActivityLottery {
    public static void main(String[] args) {
        int[] ticket = { 34, 43, 45, 65, 21, 54 };
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        ticket2[2] = 54;

        printTicketNumbers(ticket, 1);
        printTicketNumbers(ticket2, 2);
    }

    public static void printTicketNumbers(int[] ticket, int ticketNumber) {
        System.out.print("Ticket " + ticketNumber + " numbers: ");

        for (int number : ticket) {
            System.out.print(number + " ");
        }

        System.out.println("\n");
    }
}
