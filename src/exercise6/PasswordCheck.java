package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean is_valid = true;
        int digit_counter = 0;
        int len = 0;
        do {
            is_valid = true;
            String password = input.next();
            len = password.length();
            for (int i = 0; i < len; i++) {
                if (!Character.isLetterOrDigit((password.charAt(i)))) {
                    is_valid = false;
                    break;
                } else if (Character.isDigit((password.charAt(i)))) {
                    digit_counter++;
                }
            }

        } while ((!is_valid) || digit_counter < 2 || len < 8 );

        System.out.println("Password valid!");
    }
}
