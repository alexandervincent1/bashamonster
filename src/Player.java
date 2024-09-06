public class Player {
    public Health health = new Health();
    public Damage damage = new Damage();

    public Player()
    {
        health.max = 100;
        health.min = 0;
        health.current = health.max;
    }
}
