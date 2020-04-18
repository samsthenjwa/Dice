import java.util.Random;

public class Die {
    int sides;
    int value;

    public Die(int sides) {
        this.sides = sides;
    }

    public static void main(String[] args)
    {
        Die die6 = new Die(6);
        die6.roll();
        System.out.println(die6.value);
    }

    public int roll()
    {
        Random random = new Random(); // rolling the die
        value = random.nextInt(this.sides); // assigning the random number between 0 - side  to value
        return value; // returning the results
    }

}
