import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int largest;
        int number;

        System.out.print("Enter number 1: ");
        largest = s.nextInt();

        for(int i=1; i < 3; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            number = s.nextInt();

            if(number > largest){
                largest = number;
            }
        }

        System.out.print("Largest Number : " + largest);

        s.close();
    }
}
