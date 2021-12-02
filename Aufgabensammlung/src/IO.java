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
     * Liest ein eindimensionales Array mit Text von der Konsole ein
     * @return eindimensionales Array mit String
     * @throws IOException
     */
    public static String[] readArrayStringArray1D() throws IOException {
        System.out.print("Wie groß soll das Array sein: ");
        int n = IO.readInt();

        return readStringArray1D(n);
    }

    /**
     * Liest ein eindimensionales Array mit Text von der Konsole ein
     * @param n
     * @return eindimensionales Array mit String
     * @throws IOException
     */
    public static String[] readStringArray1D(int n) throws IOException {
        System.out.println("Was soll erfasst werden?");
        String erfassung = IO.readString();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Bitte " + (i + 1) + " " + erfassung + " eingeben: ");
            array[i] = IO.readString();
        }
        return array;
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
     * Liest ein eindimensionales Array mit Ganzzahl von der Konsole ein
     * @return eindimensionales Array mit Ganzzahl
     * @throws IOException
     */
    public static int[] readIntArray1D() throws IOException {

        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

        return readIntArray1D(n);
    }

    /**
     * Liest ein eindimensionales Array mit Ganzzahl von der Konsole ein (erwartet int)
     * @param n
     * @return eindimensionales Array mit Ganzzahl
     * @throws IOException
     */
    public static int[] readIntArray1D(int n) throws IOException {
        System.out.println("Was soll erfasst werden?");
        String erfassung = IO.readString();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Bitte " + (i + 1) + " " + erfassung + "  eingeben: ");
            array[i] = IO.readInt();
        }
        return array;
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

    /**
     * Liest ein eindimensionales Array mit Nachkommazahl von der Konsole ein
     * @return eindimensionales Array mit Nachkommastelle
     * @throws IOException
     */
    public static double[] readDoubleArray1D() throws IOException {
        System.out.println("Wie viele Werte sollen erfasst werden: ");
        int n = IO.readInt();

       return readDoubleArray1D(n);
    }

    /**
     * Liest ein eindimensionales Array mit Nachkommazahl von der Konsole ein (erwartet int)
     * @param n
     * @return eindimensionales Array mit Nachkommastelle
     * @throws IOException
     */
    public static double[] readDoubleArray1D(int n) throws IOException {
        System.out.println("Was soll erfasst werden?");
        String erfassung = IO.readString();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Bitte " + (i + 1) + " " + erfassung + "  eingeben: ");
            array[i] = IO.readDouble();
        }
        return array;
    }

    //Boolean
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
