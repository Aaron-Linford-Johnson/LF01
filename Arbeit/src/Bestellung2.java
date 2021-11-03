import java.io.IOException;

public class Bestellung2 {
    public static void main(String[] args) throws IOException {
        //Produkte
        double schrauben;
        double muttern;
        double unterlegscheiben;
        //Preise
        double schraubenpreis = 0.05;
        double mutternPreis = 0.03;
        double unterlegscheibenPreis = 0.01;

        boolean richtig;
        //Schrauben
        double schraubenNeuPlus;
        double schraubeHinzu;

        //Muttern
        double mutternNeuPlus;
        double mutternHinzu;
        double mutterEntf;
        double mutterNeuMinus;

        //Unterlegscheiben
        double unterlegscheibenHinzu;
        double unterlegscheibenNeuPlus;
        double unterlegscheibenEntf;
        double unterlegscheibenNeuMinus;



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

            } else   System.out.println("Wollen sie ihre Bestellung bearbeiten (Ja) oder (Nein)");
            boolean bearbeiten = IO.readBoolean();

            if (bearbeiten) {
                System.out.println("Ihr Warenkorb:");
                System.out.println("Schraube/n: " + schrauben);
                System.out.println("Mutter/n: " + muttern);
                System.out.println("Unterlegscheibe/n: " + unterlegscheiben);
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
                        schraubeHinzu = IO.readDouble();
                        schraubenNeuPlus = (schrauben + schraubeHinzu) * schraubenpreis;

                    }

                } else if (auswahlBearbeitung.equals("2")) {
                    System.out.println("Mutter/n: " + muttern);
                    System.out.println("Möchten sie Muttern entfernen oder hinzufügen?");
                    System.out.println("(1) Hinzufügen");
                    System.out.println("(2) entfernen");
                    String mutterHinzuEntf = IO.readString();

                    if (mutterHinzuEntf.equals("1")) {
                        System.out.println(" Ihre derzeitigen Mutteranzahl: " + muttern);
                        System.out.print("Wie viele Mutter möchten sie hinzufügen: ");
                        mutternHinzu = IO.readDouble();
                        mutternNeuPlus = (muttern + mutternHinzu) * schraubenpreis;

                    } else if (mutterHinzuEntf.equals("2")) {
                        System.out.println(" Ihre derzeitigen Unterlegscheibenanzahl: " + muttern);
                        System.out.print("Wie viele Unterlegscheiben möchten sie entfernen: ");
                        mutterEntf = IO.readDouble();
                        mutterNeuMinus = (unterlegscheiben - mutterEntf) * schraubenpreis;

                    } else if (auswahlBearbeitung.equals("3")) {
                        System.out.println("Unterlegscheibe/n: " + muttern);
                        System.out.println("Möchten sie Unterlegscheiben entfernen oder hinzufügen?");
                        System.out.println("(1) Hinzufügen");
                        System.out.println("(2) entfernen");
                        String unterlegscheibenHinzuEntf = IO.readString();

                        if (unterlegscheibenHinzuEntf.equals("1")) {
                            System.out.println(" Ihre derzeitigen Unterlegscheibenanzahl: " + muttern);
                            System.out.print("Wie viele Unterlegscheiben möchten sie hinzufügen: ");
                            unterlegscheibenHinzu = IO.readDouble();
                            unterlegscheibenNeuPlus = (unterlegscheiben + unterlegscheibenHinzu) * schraubenpreis;

                        } else if (unterlegscheibenHinzuEntf.equals("2")) {
                            System.out.println(" Ihre derzeitigen Unterlegscheibenanzahl: " + muttern);
                            System.out.print("Wie viele Unterlegscheiben möchten sie entfernen: ");
                            unterlegscheibenEntf = IO.readDouble();
                            unterlegscheibenNeuMinus = (unterlegscheiben - unterlegscheibenEntf) * schraubenpreis;

                        }
                    } else
                }
            }
        }
    }
}
