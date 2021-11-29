import java.io.IOException;

public class Verdoppeln {
    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie ein Array aus Kommazahlen ein.");
        double[] array = IO.readDoubleArray();

        System.out.println("Ursprüngliches Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }

        System.out.println("\nVerdoppeltes Array:");
        for (int i = 0; i < array.length; i++){
            System.out.print((array[i] + array[i]) + "\t\t");
        }
    }
}
