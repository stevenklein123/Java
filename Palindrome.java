import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String reversed = "";


        System.out.print("Enter Word : ");
        String words = s.nextLine();


        for(int i= words.length()-1; i >= 0; i--){
            char word = words.charAt(i);

            reversed = reversed + word;
        }

        if(words.equalsIgnoreCase(reversed)) System.out.println("Palindrome");
        else System.out.print("Not Palindrome");

        s.close();
    }
}
