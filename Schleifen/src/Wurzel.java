import java.io.IOException;

public class Wurzel {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie den Anfangswert ein: ");
        int anfang = IO.readInt();

        System.out.print("geben sie den Endwert ein: ");
        int ende = IO.readInt();


        for (int i = anfang ; i <= ende; i++) {
            if(i%2 == 0) {
                System.out.println(i + " = " + Math.sqrt(i));
            }
        }
    }
}
