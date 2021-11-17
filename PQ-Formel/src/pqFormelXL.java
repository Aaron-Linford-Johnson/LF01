import java.io.IOException;

public class pqFormelXL {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie P ein: ");
        double p =  IO.readDouble();

        System.out.print("Geben sie Q ein: ");
        double q = IO.readDouble();

        double d = Math.sqrt((Math.pow(p/2,2)-q));

        double x1;
        double x2;

        if (d > 0) {

             x1 = - p/2 - Math.sqrt((Math.pow(p/2,2)-q));

             x2 = - p/2 + Math.sqrt((Math.pow(p/2,2)-q));

            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if (d == 0) {

            x1 = - p/2 - Math.sqrt((Math.pow(p/2,2)-q));

            System.out.println("x1,2 = "+x1);
        }
        else

            System.out.println("Berechnung nicht möglich!");




    }
}
