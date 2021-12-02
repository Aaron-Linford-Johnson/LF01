import java.io.IOException;

public class TestArrwayDouble {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

        double[] werteliste = new double[n];

        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + i + " Wert eingeben: ");
            werteliste[i] = IO.readDouble();
        }
        // Ausgabe des Arrays
        for (int i = 0; i < werteliste.length; i++) {
            System.out.println("Wert-" + i + ": " + werteliste[i]);
        }

    }

}
