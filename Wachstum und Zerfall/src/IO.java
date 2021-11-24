import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //String
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
     *
     * @return Werteliste
     * @throws IOException
     */
    public static String[] readArrayString() throws IOException {
        System.out.print("Wie groß soll das Array sein: ");
        int n = IO.readInt();

        readArrayString(n);

        return werteliste;


        }

    }
    public static String[] readArrayString(int n) throws IOException {

        String[] werteliste = new String[n];
        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + (i + 1) + " Werte eingeben: ");
            werteliste[i] = IO.readString();
        }
        return werteliste;
    }

    //Integer
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
     * Liest ein Array mit Ganzzahl von der Konsole ein
     * @return Werteliste
     * @throws IOException
     */
    public static int[] readArrayInt() throws IOException {

        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

        return readArrayInt(n);
        }

    /**
     *
     * @param n
     * @return
     * @throws IOException
     */
    public static int[] readArrayInt(int n) throws IOException {
        int[] werteliste = new int[n];
        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + (i + 1) + " Wert eingeben: ");
            werteliste[i] = IO.readInt();
        }
        return werteliste;
    }

    //Double
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

    //Boolean
    /**
     *
     * @return Werteliste
     * @throws IOException
     */
    public static double[] readArraydouble() throws IOException {
        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

        double[] werteliste = new double[n];

        for (int i = 0; i < werteliste.length; i++) {
            System.out.print("Bitte den " + (i + 1) + " Wert eingeben: ");
            werteliste[i] = IO.readDouble();
        }

        for (int i = 0; i < werteliste.length; i++) {
            System.out.println("Wert-" + (i + 1) + ": " + werteliste[i]);
        }
        return werteliste;
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
                    || (eingabe.equalsIgnoreCase("Yes"))) {
                return true;
            }
            if (eingabe.equalsIgnoreCase("Nein")
                    || (eingabe.equalsIgnoreCase("n"))
                    || (eingabe.equalsIgnoreCase("No"))) {
                return false;
            }
            System.out.print("Ungültige Eingabe! Bitte erneut versuchen: ");
        }
    }
}
