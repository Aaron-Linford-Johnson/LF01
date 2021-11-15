import java.io.IOException;

public class Kreiszahl {
    public static void main(String[] args) throws IOException {

        System.out.print("Bestimme n: ");
        double n = IO.readDouble();

        double kreisZahl = Math.pow(-1, n) / 2 * n + 1;

        System.out.println("Die Zahl Pi ist: "+Math.PI);
        System.out.println("Die erfasste Kreiszahl ist: "+kreisZahl);

        if (kreisZahl < Math.PI){
        System.out.println("Die Abweichung beträgt: "+(Math.PI - kreisZahl));

        }
        else System.out.println("Die Abweichung beträgt: "+(kreisZahl - Math.PI));
    }
}
