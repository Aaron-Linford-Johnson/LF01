import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geben sie eine belibige Ganzzahl ein:");
        String eingabe = br.readLine();
        int zahl = Integer.parseInt(eingabe.trim());

        int summe = 0;

        for (int i = 0; i <= zahl ; i++) {
            summe = summe+i;
        }
        System.out.println("Die Summe von der for-Schleife ist: "+summe);

        int j = 0;
        int summe2 = 0;

        while (j <= zahl)
        {
            summe2 += j;
            j++;
        }
        System.out.println("Die Summe von der While-Schleife ist: "+summe2);

        int x = 0;
        int summe3 = 0;

        do {
            summe3 += x;
            x++;
        } while (x <= zahl);

        System.out.println("Die Summe von der Do-Schleife ist: "+summe3);












    }
}
