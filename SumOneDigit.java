import java.util.Scanner;

public class SumOneDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter Number : ");
        int number = s.nextInt();

        while (number >= 10) {

            int sum = 0;

            while (number > 0) {

                
            int digit = number % 10;

            sum+=digit;

            number = number/10;
                
            }

        number = sum;       
        }

        System.out.println(number);


        s.close();
    }
}
