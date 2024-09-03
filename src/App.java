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
            System.out.println("Välj attack");
            System.out.println("1.Uppercut");
            System.out.println("2.Punch");
            int val = tangentbord.nextInt();

            if (val == 1) {
                micke.health.current = micke.health.current - uppercut;
                System.out.println("Du gjorde "+uppercut+" Skada och Micke har nu"+micke.health.current+" liv kvar");
                System.out.println("Nu är det Mickes tur och attackera");
                spelare.health.current = spelare.health.current - punch;
                System.out.println("Micke gjorde "+punch+" och du har nu "+spelare.health.current+" liv kvar");
            }

            if (val == 2) {
                micke.health.current = micke.health.current - punch;
                System.out.println("Du gjorde "+punch+" Skada och Micke har nu"+micke.health.current+" liv kvar");
                System.out.println("Nu är det Mickes tur och attackera");
                spelare.health.current = spelare.health.current - uppercut;
                System.out.println("Micke gjorde "+uppercut+" och du har nu "+spelare.health.current+" liv kvar");
            }

            

        }

        if (micke.health.current < micke.health.min) {
            System.out.println("Grattis du vann mot Micke han har nu 0 liv och du har "+spelare.health.current+" liv");
            System.out.println("1.Kör igen");
            System.out.println("2.Avsluta");
            System.out.println("2.Avsluta");
            int körigen = tangentbord.nextInt()
            if (körigen==1) {
                micke.health.current = micke.health.max;
                spelare.health.current = spelare.health.max;
            }
            
        }
        else if (spelare.health.current > spelare.health.min) {
            System.out.println("Du har förlorat mot Micke han har "+micke.health.current+" liv och du har 0");
            System.out.println("1.Kör igen");
            System.out.println("2.Avsluta");
            int körigen = tangentbord.nextInt()
            if (körigen==2) {
                break;
            }
        }
    }

}
