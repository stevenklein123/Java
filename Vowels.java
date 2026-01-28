import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vowelCount = 0;
        int consonantCount = 0;

        System.out.print("Enter Wor :");
        String text = s.nextLine().toLowerCase();

        for(int i=0; i < text.length(); i++){

            char character = text.charAt(i);

            if(character == ' '){
                continue;
            }else if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowelCount++;
            }else{
                consonantCount++;
            }

        }

        System.out.println("Vowel : " + vowelCount);
        System.out.println("Consonant : " + consonantCount);


        s.close();
    }
}
