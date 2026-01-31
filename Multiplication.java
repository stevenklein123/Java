import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = s.nextInt();

        for(int i =1; i <= 10;i++){
            int result = number * i;

            System.out.println(result);
        }

        s.close();
    }
}
