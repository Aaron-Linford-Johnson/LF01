import java.io.IOException;

public class Zellwachstum {
    public static void main(String[] args) throws IOException {

        boolean wiederholen;

        do {

            System.out.print("Bitte die aktuelle Zelllmenge eingeben: ");
            double zellMenge = IO.readDouble();

            System.out.print("Bitte den Wachstumfaktor eingeben:");
            double wFaktor = IO.readDouble();

            System.out.print("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
            double laufzeit = IO.readDouble();

            System.out.println("Tag\t\t\tZellmenge");

            for (int i = 0; i <= laufzeit; i++) {

                double fX = zellMenge * wFaktor;

                System.out.println(i + "\t\t\t" + fX);

                wFaktor = wFaktor + wFaktor + wFaktor;

            }

            System.out.print("Wollen sie noch eine Rechnung durchführen: ");
            wiederholen = IO.readBoolean();
        } while (wiederholen);
    }
}
