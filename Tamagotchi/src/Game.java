import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tamagotchi animal = new Tamagotchi("",2,"Happy",10,0);

        String welcomeMSG = "Welcome player, please choose \"1\" for a Rooster as pet or choose \"2\" for a Monkey as pet.";
        System.out.println(welcomeMSG);
        boolean whileChecker = true;

        while(whileChecker) {
            int petChoosingInput;
            try {
                petChoosingInput = scanner.nextInt();
                if (petChoosingInput == 1) {
                    String roosterName = giveRoosterName();
                    animal = new Rooster(roosterName,2,"Happy",10,false, 0);
                    whileChecker = false;

                } else if (petChoosingInput == 2) {
                    String monkeyName = giveMonkeyName();
                    animal = new Monkey(monkeyName,2,"Happy",10,false, 0);

                    whileChecker = false;

                } else {
                    System.out.println("You didnt take either \"1\" or \"2\" please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("You didnt type a number");
                scanner.next();
            }
        }
        animal.chooseActivityForAnimal();


    }

    public static String giveRoosterName() {
        System.out.println("You choose Rooster\nWhat would you like to call it?");
        String roosterName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return roosterName;
    }
    public static String giveMonkeyName() {
        System.out.println("You choose Monkey\nWhat would you like to call it?");
        String monkeyName = scanner.next() + scanner.nextLine();
        System.out.println("What a lovely name");
        return monkeyName;
    }

















}
