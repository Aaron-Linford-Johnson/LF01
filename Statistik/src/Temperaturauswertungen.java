import java.io.IOException;

public class Temperaturauswertungen {
    public static void main(String[] args) throws IOException {

        System.out.print("Bitte geben sie die Temperatur an Tag 1 ein: ");
        double tag1 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 2 ein: ");
        double tag2 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 3 ein: ");
        double tag3 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 4 ein: ");
        double tag4 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 5 ein: ");
        double tag5 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 6 ein: ");
        double tag6 = IO.readDouble();

        System.out.print("Bitte geben sie die Temperatur an Tag 7 ein: ");
        double tag7 = IO.readDouble();

        double mittelwert = (tag1 + tag2 + tag3 +tag4 +tag5 + tag6 + tag7) /7;

        double max;

        if (tag1 > tag2){

            max = tag1;
        }
        else {

            max = tag2;
        }
        if (tag3 > max){

            max= tag3;
        }
        if (tag4 > max){

            max = tag4;
        }
        if (tag5 > max){

            max = tag5;
        }
        if (tag6 > max){

            max = tag6;
        }
        if (tag7 > max){

            max = tag7;
        }

        double min;

        if (tag1 < tag2){

            min = tag1;
        }
        else {

            min = tag2;
        }
        if (tag3 < min){

            min = tag3;
        }
        if (tag4 < min){

            min = tag4;
        }
        if (tag5 < min){

            min = tag5;
        }
        if (tag6 < min){

            min = tag6;
        }
        if (tag7 < min){

            min = tag7;
        }

        double spannweite = max - min;

        double dif1 = tag2 - tag1;

        double dif2 = tag3 - tag2;

        double dif3 = tag4 - tag3;

        double dif4 = tag5 - tag4;

        double dif5 = tag6 - tag5;

        double dif6 = tag7 - tag6;

        double dif;

        if (dif1 > dif2){

            dif = dif1;
        }
        else {

            dif = dif2;
        }
        if (dif3 > dif) {

            dif = dif3;
        }
        if (dif4 > dif){

            dif = dif4;
        }
        if (dif5 > dif){

            dif = dif5;
        }
        if (dif6 > dif){

            dif = dif6;
        }


        System.out.println("Mittelwert         : \t" +mittelwert);
        System.out.println("Maximale Temperatur: \t" + max);
        System.out.println("Minimale Temperatur: \t" +min);
        System.out.println("Spannweite         : \t" + spannweite);
        System.out.println("Maximale Differenz : \t" +dif);

    }
}


















