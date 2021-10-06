public class Monkey extends Tamagotchi {
    public boolean scream;

    public Monkey(String name, int age, String mood, int energy, boolean scream, int money) {
        super(name, age, mood, energy, money);
        this.scream = scream;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                " Name = '" + name + '\'' +
                " , Age = " + age +
                " , Mood = '" + mood + '\'' +
                " , Energy = " + energy +
                " , Money = " + money +
                " } ";
    }
}

