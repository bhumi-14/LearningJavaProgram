package ex_03_ForLoopAndIfElse;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Nitin";
        name = name.toLowerCase(); // convert to lowercase

        boolean isPal = true;
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                isPal = false;
                break;
            }
        }

        if (isPal) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }

}
;