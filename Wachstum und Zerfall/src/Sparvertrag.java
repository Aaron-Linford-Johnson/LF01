import java.io.IOException;

public class Sparvertrag {
    public static void main(String[] args) throws IOException {

        boolean wiederholen;
        do {

        System.out.print("Bitte das Startkapital eingeben: ");
        double sKapital = IO.readDouble();

        System.out.print("Bitte den Zinssatzeingeben: ");
        double zinssatz = IO.readDouble();

        System.out.print("Bitte die Laufzeit eingeben: ");
        int laufzeit = IO.readInt();

        System.out.println("Jahr\t\t\tAnfangskapital\t\t\tZinsbetrag\t\t\tJahresendbetrag");

        for (int i = 1; i <= laufzeit; i++) {

            double zinsbetrag = sKapital * (zinssatz/100);

            double jahresendbetrag = sKapital + zinsbetrag;

            double newSKapital =Math.round(100 * sKapital) / 100.0;

            double newZinsbetrag =Math.round(100 * zinsbetrag) / 100;

            double newJahresendbetrag =Math.round (100 * jahresendbetrag) / 100;

            System.out.println(i +"\t\t\t\t"+ newSKapital +"\t\t\t\t\t" +newZinsbetrag +"\t\t\t\t" +newJahresendbetrag);

            sKapital = sKapital + zinsbetrag;
        }

        System.out.print("Weiteren Sparvetrag berechenen: ");
        wiederholen = IO.readBoolean();



        } while (wiederholen);
    }
}
