import java.io.IOException;

public class Balkendiagramm {
    public static void main(String[] args) throws IOException {

        System.out.println("Wie viele Kandidaten sind noch im Rennen? ");
        int n = IO.readInt();
        int[] array = new int[n];

        System.out.println("Erfassen Sie jetzt die prozentuale des Votings");

        for (int i = 0; i < array.length; i++){
            System.out.print("kanditat " + (i+1) + " : ");
            array[i] = IO.readInt();
        }
        System.out.println("Ergebnis");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <= (array[i] - 1); j++){
                System.out.print("* ");
            }
            System.out.println(array[i] + "%");
        }
    }
}
