import java.io.IOException;

public class Bestellung {
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
        double neuSchrauben;
        double neuSchraubenAnzahl;
        double neuSchraubenPreis;

        //Muttern
        double neuMuttern;
        double neuMutternAnzahl;
        double neuMutternPreis;


        //Unterlegscheiben
        double neuUnterlegscheiben;
        double neuUnterlegscheibenAnzahl;
        double neuUnterlegscheibenPreis;

        //Gesamtkosten
        double gesamtkosten;
        double neuGesamtkosten;



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
        gesamtkosten = schraubenAnzahl + mutternAnzahl + unterlegscheibenAnzahl;

        System.out.println("Warenkorb:");
        System.out.println("Schrauben: " + "Anzahl = " + schrauben+ " Stück" + " Preis = " +schraubenAnzahl + "€");
        System.out.println("Muttern: " + "Anzahl = " + muttern+ " Stück" + " Preis = " +mutternAnzahl + "€");
        System.out.println("Unterlegscheiben: " + "Anzahl = " + unterlegscheiben+ " Stück" + " Preis = " +unterlegscheibenAnzahl + "€");
        System.out.println("Gesamtkosten: " +gesamtkosten +"€");

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
                System.out.println("Anzahl der Schrauben: "+schrauben);
                System.out.println("Anzahl der Muttern: "+muttern);
                System.out.println("Anzahl der Unterlegscheiben: "+unterlegscheiben);
                System.out.print("Wie viele Schrauben wollen sie hinzufügen: ");
                neuSchrauben = IO.readDouble();
                System.out.print("Wie viel Muttern wollen sie hinzufügen: ");
                neuMuttern = IO.readDouble();
                System.out.println("Wie viele Unterlegscheiben wollen sie hinzufügen: ");
                neuUnterlegscheiben = IO.readDouble();

                neuSchraubenAnzahl = schrauben + neuSchrauben;
                neuMutternAnzahl = muttern + neuMuttern;
                neuUnterlegscheibenAnzahl = unterlegscheiben +neuUnterlegscheiben;

                neuSchraubenPreis = (schrauben + neuSchrauben) * schraubenpreis;
                neuMutternPreis = (muttern + neuMuttern) * mutternPreis;
                neuUnterlegscheibenPreis = (unterlegscheiben + neuUnterlegscheiben) * unterlegscheibenPreis;

                neuGesamtkosten = neuSchraubenPreis + neuMutternPreis + neuUnterlegscheibenPreis;

                System.out.println("Warenkorb:");
                System.out.println("Schrauben: " + "Anzahl = " + neuSchraubenAnzahl+ " Stück" + " Preis = " +neuSchraubenPreis + "€");
                System.out.println("Muttern: " + "Anzahl = " + neuMutternAnzahl+ " Stück" + " Preis = " +neuMutternPreis + "€");
                System.out.println("Unterlegscheiben: " + "Anzahl = " + neuUnterlegscheibenAnzahl+ " Stück" + " Preis = " +neuUnterlegscheibenPreis + "€");
                System.out.println("Gesamtkosten: " +neuGesamtkosten +"€");

                System.out.println("Wollen sie jetzt bezahlen?");
                boolean neuBezahlen = IO.readBoolean();

                if (neuBezahlen){
                    System.out.println("Danke für ihren Einkauf!");
                } else System.out.println("Sie müssen den kompletten Einkauf wiederholen.");



            } else System.out.println("Dann danken wir ihnen für ihren Einkauf und wünschen ihnen noch einen Schönen Tag ");
            }
    }
}
