import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.LinkedTransferQueue;

public class Lagerbestand {
    public static void main(String[] args) throws IOException {

        int insgesamtArt = 0;
        double insgesamtWert = 0;

        System.out.println("wie viele unterschiedliche Artikel haben sie im Lager? ");
        int artikel = IO.readInt();
        System.out.println("Erfassen Sie die einzelnen Artikelbezeichnungen:");
        String[] array = IO.readStringArray1D(artikel);

        System.out.println("Erfassen sie jetzt den Einzelpreis jedes Artikels:");
        double[] preis = new double[artikel];
        for (int i = 0; i < preis.length; i++){
            System.out.print("\n" + "Preis des Artikels " + array[i] + ": " );
            preis[i] = IO.readDouble();

        }

        System.out.println("Erfassen sie jetzt die Anzahl der einzelenen Artikel:");
        int[] anzahl = new int[artikel];
        for (int i = 0; i < anzahl.length; i++){
            System.out.print("\n" + "Menge des Artikels " +array[i] + ": ");
            anzahl[i] = IO.readInt();
            insgesamtArt = insgesamtArt + anzahl[i];
        }

        for (int i = 0; i < array.length; i++){
            insgesamtWert = insgesamtWert + ( anzahl[i] * preis[i]);

        }

        System.out.println("In ihrem Lager befinden sich Insgesamt " + insgesamtArt + " Artikel im Wert von " + insgesamtWert + "€.");






    }
}
