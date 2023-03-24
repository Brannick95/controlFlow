import java.util.Scanner;

public class controlFlow {
    Scanner input = new Scanner(System.in);

    int userInput = input.nextInt();

    public static void printNumbers() {
        // TODO: print valid numeric input
        for (int i = 48; i <= 57; i++) {
            char c = (char) i;
            System.out.println(c);
        }
    }

    public static void printLowerCase() {
        // TODO: print valid lowercase alphabetic input
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            System.out.println(c);
        }
    }

    public static void printUpperCase() {
        // TODO: print valid uppercase alphabetic input
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            System.out.println(c);
        }
    }

}
