import java.util.Random;
public class Damage {
    Random tärning = new Random();
        int slumptal = tärning.nextInt(100);
        int slumptal1 = tärning.nextInt(100);
        int uppercut = slumptal;
        int punch = slumptal1;

    public int Uppercut()
    {
        return tärning.nextInt(100);
    }
    public int punch()
    {
        return tärning.nextInt(100);
    }
}
