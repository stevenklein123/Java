import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter Number : ");
        int n = s.nextInt();

        for(int i=0; i < n; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            int input = s.nextInt();

            if(input % 2==0){
                evenCount ++; 
            }else{
                oddCount ++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);


        s.close();
    }
}
