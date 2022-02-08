import java.io.IOException;

public class LF05 {
    public static void main(String[] args) throws IOException {

        System.out.println("Auf welcher Seite soll gebucht werden? (Aktiv/Passiv)");
        System.out.println("[1] Aktiv");
        System.out.println("[2] Passiv");
        System.out.print("Eingabe: ");
        int aktivPassiv = IO.readInt();
        System.out.println("\n-----------------------------------------------------------------");
        if (aktivPassiv == 1){
            System.out.println();
        }

    }
}
