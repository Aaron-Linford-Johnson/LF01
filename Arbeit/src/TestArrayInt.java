import java.io.IOException;

public class TestArrayInt {
    public static void main(String[] args) throws IOException {
        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

        int[] werteliste = new int[n];

        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + i + " Wert eingeben: ");
            werteliste[i] = IO.readInt();
        }
        // Ausgabe des Arrays
        for (int i = 0; i < werteliste.length; i++) {
            System.out.println("Wert-" + i + ": " + werteliste[i]);
        }

    }

}
