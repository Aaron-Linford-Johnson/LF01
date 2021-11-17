import java.io.IOException;

public class pqFormelXXL {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie a ein: ");
        double a =  IO.readDouble();

        System.out.print("Geben sie b ein: ");
        double b =  IO.readDouble();

        System.out.print("Geben sie c ein: ");
        double c =  IO.readDouble();

        double x1 = -b + Math.sqrt(Math.pow(b,2) -4 * a * c)/ 2 * a;
        double x2 = -b - Math.sqrt(Math.pow(b,2) -4 * a * c)/ 2 * a;
        double d = Math.sqrt(Math.pow(b,2) -4 * a * c)/ 2 * a;

        if (d > 0) {

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
        else if (d == 0) {

            System.out.println("X1,2 = " +x1);
        }
        else System.out.println("Berechnung nicht möglich!");
    }
}
