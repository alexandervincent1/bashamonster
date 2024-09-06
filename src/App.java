import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Enemy micke = new Enemy();
        Player spelare = new Player();
        Damage spelareskada = new Damage();
        Damage fiendeskada = new Damage();

        System.out.println("Tryck på enter för och starta spel");
        tangentbord.nextLine();
        while (micke.health.current > micke.health.min && spelare.health.current > spelare.health.min) {
            System.out.println("\nVälj attack");
            System.out.println("1.Uppercut");
            System.out.println("2.Punch");
            int val = tangentbord.nextInt();

            if (val == 1) {
                int u = spelare.damage.Uppercut();
                int p = micke.damage.Uppercut();
                micke.health.current = micke.health.current - u;
                System.out.println("\nDu gjorde " + u + " Skada och Micke har nu " + micke.health.current + " liv kvar");
                System.out.println(" \nNu är det Mickes tur och attackera");
                spelare.health.current = spelare.health.current - p;
                System.out.println("Micke gjorde " + p + " och du har nu " + spelare.health.current + " liv kvar");
            }

            if (val == 2) {
                int u = spelare.damage.Uppercut();
                int p = micke.damage.Uppercut();
                micke.health.current = micke.health.current - p;
                System.out.println("\nDu gjorde " + p + " Skada och Micke har nu " + micke.health.current + " liv kvar");
                System.out.println("\nNu är det Mickes tur och attackera");
                spelare.health.current = spelare.health.current - u;
                System.out.println("Micke gjorde " + u + " och du har nu " + spelare.health.current + " liv kvar");
            }

        

        if (micke.health.current < micke.health.min) {
            System.out.println(
                    "\nGrattis du vann mot Micke han har nu 0 liv och du har " + spelare.health.current + " liv");
            System.out.println("\n1.Kör igen");
            System.out.println("2.Avsluta");
            int körigen = tangentbord.nextInt();
            if (körigen == 1) {
                micke.health.current = micke.health.max;
                spelare.health.current = spelare.health.max;
            }

        } else if (spelare.health.current < spelare.health.min) {
            System.out.println("\nDu har förlorat mot Micke han har " + micke.health.current + " liv och du har 0");
            System.out.println("\n1.Kör igen");
            System.out.println("2.Avsluta");
            int körigen = tangentbord.nextInt();
            if (körigen==1) {
                spelare.health.current = spelare.health.max;
                micke.health.current = micke.health.max;
            }
            if (körigen == 2) {
                System.out.println("Hejdå");
            }
        }
    }
}

}
