import java.io.IOException;

public class BerechnungDesGesamtwiderstands {
    public static void main(String[] args) throws IOException {

        System.out.println("Wählen sie eine Schaltungsart:");
        System.out.println("[P] für Parallelschaltung");
        System.out.println("[R] für Reihenschaltung");
        String auswahl = IO.readString();


        double r1;
        double r2;
        double rg;

        if (auswahl.equalsIgnoreCase("p")) {

            System.out.print("Geben sie den Wiederstand von Reihenschaltung 1 ein: ");
            r1 = IO.readDouble();

            System.out.print("Geben sie den Wiederstand von Reihenschaltung 2 ein: ");
            r2 = IO.readDouble();

            rg = (r1*r2) / (r1 + r2);

            System.out.println("Der Gesamtwiederstand beträgt: "+rg);

        }
        else if (auswahl.equalsIgnoreCase("r")) {

            System.out.print("Geben sie den Wiederstand von Reihenschaltung 1 ein: ");
            r1 = IO.readDouble();

            System.out.print("Geben sie den Wiederstand von Reihenschaltung 2 ein: ");
            r2 = IO.readDouble();

            rg = r1 + r2;

            System.out.println("Der Gesamtwiederstand beträgt: "+rg);
        }
        else
            System.out.println("Fehlerhafte Eingabe! Bitte erneut einben.");



    }
}
