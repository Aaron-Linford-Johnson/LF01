import java.io.IOException;

public class Maexchen {
    public static void main(String[] args) throws IOException {

        System.out.print("Augenzahl Würfel 1: ");
        int w1 = IO.readInt();

        System.out.print("Augenzahl Würfel 2: ");
        int w2 = IO.readInt();

        if (w1 == 1 && w2 == 2 || w1 == 2 && w2 == 1) {

            System.out.println("Mäxchen! Du hast 1000 Punkte dazu gewonnen.");
        }
        else if (w1 == w2) {

            int pasch = 100 * w1;

            System.out.println("Pasch! du hast "+pasch +" Punkte dazu gewonnen.");
        }
        else if (w1 > w2) {

            System.out.println("Du hast " +(w1 - w2) +" Punkte dazu gewonnen");
        }
        else
            System.out.println("Du hast " +(w2 - w1) +" Punkte dazu gewonnen.");
    }
}
