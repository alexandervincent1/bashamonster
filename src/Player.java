public class Player {
    public Health health = new Health();

    public Player()
    {
        health.max = 100;
        health.min = 0;
        health.current = health.max;
    }
}
