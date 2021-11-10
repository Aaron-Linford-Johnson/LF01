import java.io.IOException;

public class Schaltjahr {
    public static void main(String[] args) throws IOException {

        System.out.print("Bei welchen Jahr soll ihre Berechnung starten: ");
        int anfang = IO.readInt();

        System.out.print("Bis zu welchen Jahr soll ihre Berechnung gehen: ");
        int ende = IO.readInt();

        for (int i = anfang; i <= ende; i++) {



            if (i % 4 == 0 || i % 400 == 0) {


                System.out.println(i);
            }

        }
    }
}
