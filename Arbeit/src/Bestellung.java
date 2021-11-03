import java.io.IOException;

public class Bestellung {
    public static void main(String[] args) throws IOException {

        //Produkte
        double schrauben = 0;
        double muttern = 0;
        double unterlegscheiben = 0;
        //Preise
        double schraubenpreis = 0.05;
        double mutternPreis = 0.03;
        double unterlegscheibenPreis = 0.01;

        boolean richtig;


        System.out.println("Wie viele Schrauben möchten sie kaufen? (1 Stück = 5 ct)");
        schrauben = IO.readDouble();

        System.out.println("Wie viele Mutternwollen sie kaufen? ( 1 Stück = 3 ct)");
        muttern = IO.readDouble();

        System.out.println("Wie viele Unterlegscheiben wollen sie kaufen? (1 Stück = 1 ct)");
        unterlegscheiben = IO.readDouble();

        //Rechnungen

        double schraubenAnzahl = schrauben * schraubenpreis;
        double mutternAnzahl = muttern * mutternPreis;
        double unterlegscheibenAnzahl = unterlegscheiben * unterlegscheibenPreis;

        System.out.println("Warenkorb:");
        System.out.println("Schrauben: " + "Anzahl = " + schrauben+ " Stück" + " Preis = " +schraubenAnzahl + "€");
        System.out.println("Muttern: " + "Anzahl = " + muttern+ " Stück" + " Preis = " +mutternAnzahl + "€");
        System.out.println("Unterlegscheiben: " + "Anzahl = " + unterlegscheiben+ " Stück" + " Preis = " +unterlegscheibenAnzahl + "€");

        System.out.println("Wollen sie jetzt bezahlen (Ja) oder (Nein)?");
        boolean bezahlen = IO.readBoolean();


         if (schrauben != muttern && bezahlen ) {
                System.out.println("Die Anzahl der Schrauben entspricht nicht der Anzahl der Muttern. Ist das so Richtig?");
                System.out.println("Anzahl der Schrauben: " + schrauben);
                System.out.println("Anzahl der Muttern: " + muttern);
                richtig = IO.readBoolean();

                if (richtig) {
                    System.out.println("Ihre Bestellung wurde entgegengenommen. Vielen Dank für ihren Einkauf!");
                } else
                      System.out.println("Wollen sie ihre Bestellung bearbeiten (Ja) oder (Nein)");
             boolean bearbeiten = IO.readBoolean();
            }
            else
                System.out.println("Wollen sie ihre Bestellung bearbeiten (Ja) oder (Nein)");
            boolean bearbeiten = IO.readBoolean();

            if (bearbeiten) {
                System.out.println("Ihr Warenkorb:");
                System.out.println("Schraube/n: "+schrauben);
                System.out.println("Mutter/n: "+muttern);
                System.out.println("Unterlegscheibe/n: "+unterlegscheiben);
                System.out.println("Welchen Gegenstand wollen sie bearbeiten: Drücken sie (1) Schrauben (2) Muttern (3) Unterlegscheiben");
                String auswahlBearbeitung = IO.readString();

                if (auswahlBearbeitung.equals("1")) {
                    System.out.println("Schraube/n: " + schrauben);
                    System.out.println("Möchten sie Schrauben entfernen oder hinzufügen?");
                    System.out.println("(1) Hinzufügen");
                    System.out.println("(2) entfernen");
                    String schraubeHinzuEntf = IO.readString();

                    if (schraubeHinzuEntf.equals("1")) {
                        System.out.println(" Ihre derzeitigen Schraubenanzahl: " + schrauben);
                        System.out.print("Wie viele Schrauben möchten sie hinzufügen: ");
                        double schraubeHinzu = IO.readDouble();
                        double schraubenNeuPlus = (schrauben + schraubeHinzu) * schraubenpreis;




                    }
                } else System.out.println(" Ihre derzeitigen Schraubenanzahl: " + schrauben);
                System.out.print("Wie viele Schrauben möchten sie entfernen: ");
                double schraubenEntf = IO.readDouble();
                double schraubenNeuMinus = (schrauben - schraubenEntf);

            }
    }
}
