import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // controlFlow.printNumbers();
        // controlFlow.printLowerCase();
        // controlFlow.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = input.next();
        System.out.println("Hi " + name);

        System.out.println(name + " would you like to continue? y/n");
        String contin = input.next();

        if (contin.equals("y")) {
            String loopAgain = "y";
            while (loopAgain.equals("y")) {

                System.out.println("what is the name of your pet?");
                String petName = input.next();

                System.out.println("how old is your pet?");
                int petAge = input.nextInt();

                System.out.println("What is your lucky number?");
                int luckyNum = input.nextInt();

                System.out.println("Do you have a favorite quarterback? y/n");
                String qB = input.next();

                int jerseyNum = 0;
                if (qB.equals("y")) {
                    System.out.println("What is their jersey number?");
                    jerseyNum = input.nextInt();
                }

                System.out.println("What year is your car? (last 2 digets)");
                int carYear = input.nextInt();

                System.out.println("What is the name of your favorite actor/actress?");
                String actor = input.next();

                System.out.println("Enter a random number between 1 and 50.");
                int ranNum = input.nextInt();

                int number1 = 42;
                int number2 = carYear + petAge;
                int number3 = carYear + luckyNum;
                int number4 = ranNum - number1;
                int number5 = jerseyNum + petAge + luckyNum;

                int magicBall = number1 * luckyNum;
                if (magicBall >= 75) {
                    magicBall = magicBall - 75;
                }

                System.out.println("your powerball numbers are: " + number1 + " " + number2 + " " + number3 + " "
                        + number4 + " " + number5 + " Magic ball: " + magicBall);

                System.out.println(" would you like to generate more numbers? y/n");
                loopAgain = input.next();
            }
        } else {
            System.out.println("please return later to complete the survey.");
        }
        System.out.println("thank you for playing!");
    }
}
