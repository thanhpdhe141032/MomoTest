import java.util.Scanner;

public class Validate {

    private static final Scanner input = new Scanner(System.in);

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(input.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Must be input integer!!Enter again: ");
            }
        }
    }

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int number = Integer.parseInt(input.nextLine().trim());
                if (number < min || number > max) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Please input number in range [" + min + ", " + max + "]" + ".Enter again:");
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String text = input.nextLine().trim();
            if (text.isEmpty()) {
                System.out.print("Not empty!!Enter again: ");
            } else {
                return text;
            }
        }
    }

    public boolean checkInputYN() {
        System.out.print("Do you want to continue (Y/N)? ");
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.print("Please input y/Y or n/N!!Enter again: ");
        }
    }
}
