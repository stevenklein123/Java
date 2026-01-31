import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = s.nextInt();

        System.out.print("Enter number 1: ");
        int largest = s.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = s.nextInt();

            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number: " + largest);

        s.close();
    }
}
