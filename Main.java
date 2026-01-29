import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String reversed  = "";

        System.out.println("Enter Word : ");
        String word = s.nextLine();

        for(int i= word.length()-1; i >= 0; i--){

            char words = word.charAt(i);

            reversed = reversed + words;
         }

         if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
         }else{
            System.out.println("Not Palindrome");
         }

        s.close();
    }
}
