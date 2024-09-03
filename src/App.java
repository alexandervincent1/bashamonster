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
            }

            break;

        }
    }

}
