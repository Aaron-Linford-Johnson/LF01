import java.io.IOException;

public class SuchenInArray {
    public static void main(String[] args) throws IOException {


        System.out.println("Bitte geben sie 5 Kommazahlen ein.");
        double[] array = IO.readDoubleArray(5);

        System.out.print("Nach welcher zahl wollen sie suchen?");
        double zahl = IO.readDouble();

        for (int i = 0; i < array.length; i++){
            if (array[i] == zahl) {
                System.out.println("Treffer");
            }
            else {
                System.out.println("Niete");
            }
        }




        }


    }

