import java.util.Scanner;
import java.util.Random;
public class Tamagotchi {
    static Scanner scanner = new Scanner(System.in);

    public String name;
    public int age;
    public String mood;
    public int energy;
    public int money;

    public Tamagotchi(String name, int age, String mood, int energy, int money) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.money = money;
    }

    public void chooseActivityForAnimal(){
        System.out.println("What activity do you want your animal to do?");
        soutAnimalActivityScreen();
        int activityNumberForAnimal = scanner.nextInt();

        switch (activityNumberForAnimal){
            case 1:
                System.out.println("You choose to play with " + this.name);
                break;
            case 2:
                System.out.println("You choose to feed " + this.name);
                animalActivityFeed();
                break;
            case 3:
                System.out.println("You choose special");
                break;

        }
    }

    public void animalActivityFeed() {
        int animalPlayOptions = 2;
        int randomNumber = getRandomNumber(animalPlayOptions);

        String playMsgOne = this.name + " is eating";
        String playMsgTwo = this.name + " is refusing to eat";

        if (randomNumber == 1) {
            System.out.println(playMsgOne);
        } else {
            System.out.println(playMsgTwo);
        }



    }

    public int getRandomNumber(int animalPlayOptions){
        Random rand = new Random();
        int randomNumber = rand.nextInt(animalPlayOptions);
        randomNumber += 1;
        return randomNumber;
    }

    public void soutAnimalActivityScreen(){
        String[] animalActivity = {"Play", "Feed", "Special"};
        int[] animalActivityNumber = {1, 2, 3};
        for (int i = 0; i < animalActivity.length; i++) {
            System.out.println(animalActivityNumber[i] + " " + animalActivity[i]);

        }
    }

}
