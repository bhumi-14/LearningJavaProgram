package Task.javaPrograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        //4) Check if a Character is a Vowel or Consonant.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }

        sc.close();

    }
}
