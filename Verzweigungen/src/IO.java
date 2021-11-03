import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Liest einen Text von der Konsole ein.
     * @return Text
     * @throws IOException
     */

    public static String readString() throws IOException {
        return br.readLine();
        // String eingabe;
        //eingabe = br.readline();
        //return eingabe;
    }

    /**
     * Liest eine Ganzzahl in der Konsole ein
     * @return Ganzzahl
     * @throws IOException
     */
    public static int readInt() throws IOException {
        while (true){
            try {
                return Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut erfassen: ");
            }
        }

    }

    /**
     * Liest eine Nachkommazahl in der Konsole ein
     * @return Nachkommazahl
     * @throws IOException
     */

    public static double readDouble() throws IOException {
        while (true) {
            try {
                return Double.parseDouble(br.readLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Keine Nachkommazahl! Bitte erneut erfassen: ");
            }
        }
    }

    /**
     * Gibt zurück ob eingabe True oder False ist
     * @return True oder False
     * @throws IOException
     */
    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = IO.readString();
            if (eingabe.equalsIgnoreCase("Ja")
                    || (eingabe.equalsIgnoreCase("j"))
                    || (eingabe.equalsIgnoreCase("Yes"))){
                return true;
            }
            if (eingabe.equalsIgnoreCase("Nein")
                    || (eingabe.equalsIgnoreCase("n"))
                    || (eingabe.equalsIgnoreCase("No"))){
                return false;
            }
            System.out.print("Ungültige Eingabe! Bitte erneut versuchen: ");
        }
    }
}
