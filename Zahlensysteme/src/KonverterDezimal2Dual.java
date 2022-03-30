import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class KonverterDezimal2Dual {
    public static void main(String[] args) {

        int dezi = 266;
        ArrayList<Integer> arrayList = konvertDual(dezi);
        for (int i = arrayList.size() -1; i >= arrayList-1; i--) {
            System.out.println(arrayList<i>);
        }




       }

    private static ArrayList<Integer> konvertDual(int dezimalzahl) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (dezimalzahl > 0) {
            arrayList.add(dezimalzahl % 2);
            dezimalzahl = dezimalzahl / 2;
        }

        return arrayList;
    }

    private static int eingabe() throws IOException {
        System.out.println("Was wollen sie umwandeln?");
        System.out.println("[0] Eine Dezimalzahl in eine Dualzahl");
        System.out.println("[1] Eine Dualzahl in eine Dezimalzahl");
        System.out.print("\n\nIhre Eingabe: ");
        double umwandeln = IO.readDouble();

        if (umwandeln == 0) {
            System.out.print("\nGeben sie eine Dezimalzahl ein: ");
            int dezi = IO.readInt();

            return dezi;
        }
        else if (umwandeln == 1) {
            System.out.println("\nGeben sie eine Dualzahl ein: ");
            int dual = IO.readInt();

            return dual;
        }
        return 0;

}}
