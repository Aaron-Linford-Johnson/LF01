import javax.swing.*;
import java.io.IOException;

public class TestArrway {
    public static void main(String[] args) throws IOException {

        double[] werteliste = new double[4];
        double mw;
        double summe = 0;

        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + i + " Wert eingeben: ");
            werteliste[i] = IO.readDouble();
        }
        // Ausgabe des Arrays
        for (int i = 0; i < werteliste.length; i++) {
            System.out.println("Wert-" + i + ": " + werteliste[i]);
        }


        for (int i = 0; i < werteliste.length; i++) {
            summe = summe + werteliste[i];
        }
        mw = summe / werteliste.length;
        System.out.println(mw);
    }

}
