import java.io.IOException;

public class Benzinverbrauch {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie den verbrauch in Liter (l) ein: ");
        double l = IO.readDouble();

        System.out.print("Gebn sie die die gefahrene Strecke in Kilometer (KM) ein: ");
        double km = IO.readDouble();

        double durVerbrauch;

        if (km > 0) {
            durVerbrauch = 100 * l / km;

            System.out.println("Ihr Durchschnittsverbrauch liegt bei "+durVerbrauch);
        }
        else if (km == 0) {
            System.out.println("Berechnung nicht möglich! Grund: km = 0");
        }
        else
            System.out.println("Berechnung nicht möglich! Grund: km = "+km);

    }
}
