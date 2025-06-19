import java.util.Arrays;

public class IRCTCSupport {

    // Method to sort priority tickets using Dutch National Flag algorithm
    public static void sortTickets(int[] tickets) {
        int low = 0;         // Pointer for 0s
        int mid = 0;         // Pointer for current element
        int high = tickets.length - 1;  // Pointer for 2s

        while (mid <= high) {
            switch (tickets[mid]) {
                case 0:
                    // Swap low and mid, move both forward
                    int temp0 = tickets[low];
                    tickets[low] = tickets[mid];
                    tickets[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    // Just move mid forward
                    mid++;
                    break;

                case 2:
                    // Swap mid and high, move high backward
                    int temp2 = tickets[mid];
                    tickets[mid] = tickets[high];
                    tickets[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // Example bucket with priority tickets (unsorted)
        int[] tickets = {2, 0, 1, 2, 1, 0, 1, 2, 0};

        System.out.println("Before sorting: " + Arrays.toString(tickets));
        sortTickets(tickets);
        System.out.println("After sorting (by priority): " + Arrays.toString(tickets));
    }
}

