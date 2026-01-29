import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter Number : ");
        int number = s.nextInt();

        for(int i=1; i <= number; i++){

            if(i % 2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even : " + evenCount);
        System.out.println("Odd : " + oddCount);

        s.close();
    }
}
