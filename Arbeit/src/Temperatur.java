import java.io.IOException;
import java.util.Arrays;

public class Temperatur {

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

        double x;

        if (tag1 > tag2){

            x = tag1;
        }
        else {

            x = tag2;
        }
        if (tag3 > x) {

            x = tag3;
        }
        if (tag4 > x){

            x = tag4;
        }
        if (tag5 > x){

            x = tag5;
        }
        if (tag6 > x){

            x = tag6;
        }
        if (tag7 > x){

            x = tag7;
        }


        System.out.println("Der Mittelwert beträgt: " +mittelwert);
        System.out.println("Die maximale Temperatur beträgt: " + x);


    }
}
