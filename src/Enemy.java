public class Enemy {
    public Health health = new Health();

    public Enemy()
    {
        health.max = 100;
        health.min = 0;
        health.current = health.max;
    }
}
