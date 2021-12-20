import java.io.IOException;

public class Wuerfel_Anoyan {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Würfelexperimente wollen sie durchführen?");
        int anzExp = IO.readInt();

        System.out.println("Wie viele Würfel soll jedes Experiment haben?");
        int wuerfel = IO.readInt();

        int[][] array = new int[anzExp][wuerfel];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println("Geben sie Würfel " + (i+1) + " für Experiment " + (j+1) + " ein");
                array[i][j] = IO.readInt();
            }
        }

        int[] einzSumme = new int[array.length];
        int allSumme = 0;
        int arMittel = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Die letzte Zahl ist die Endsumme von Experiment " + (i+1));
            for (int j = 0; j < array[i].length; j++){
                einzSumme[i] = einzSumme[i] + array[i][j];
                allSumme = allSumme + array[i][j];
                System.out.println(einzSumme[i]);
            }
        }
        System.out.println("Die Gesamt Summe ist " + allSumme);
        arMittel = allSumme/ array.length;
        System.out.println("Das ar. Mittel ist " + arMittel);



    }
}
