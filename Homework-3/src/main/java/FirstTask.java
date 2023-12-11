import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number from 1 to 12:");
        int monthNumber = scanner.nextInt();

        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = monthNames[monthNumber - 1];
            System.out.println("Month name: " + monthName);
        } else {
            System.out.println("The entered number is out of range (1-12).");
        }
    }
}
