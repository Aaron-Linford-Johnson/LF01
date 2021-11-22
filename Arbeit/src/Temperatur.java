import java.io.IOException;
import java.util.Arrays;

public class Temperatur {

    public static void main(String[] args) throws IOException {

        System.out.print("Bitte geben sie die Temperatur an Tag 1 ein: ");
        double tagEins = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 2 ein: ");
        double tagZwei = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 3 ein: ");
        double tagDrei = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 4 ein: ");
        double tagVier = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 5 ein: ");
        double tagFuenf = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 6 ein: ");
        double tagSechs = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 7 ein: ");
        double tagSieben = IO.readDouble();

        double mittelwert = (tagEins + tagZwei + tagDrei +tagVier +tagFuenf + tagSechs + tagSieben) /7;

        double [] zahlenArray = {tagEins,tagZwei,tagDrei,tagVier,tagFuenf,tagSechs,tagSieben};
        Arrays.sort(zahlenArray);

        double max = zahlenArray[zahlenArray.length-1];

        System.out.println("Der Mittelwert beträgt: " +mittelwert);
        System.out.println("Die maximale Temperatur beträgt: " + max);


    }
}
