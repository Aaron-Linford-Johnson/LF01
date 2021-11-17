import java.io.IOException;

public class pqFormel {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie P ein: ");
        double p =  IO.readDouble();

        System.out.print("Geben sie Q ein: ");
        double q = IO.readDouble();

        double x1 = - p/2 - Math.sqrt((Math.pow(p/2,2)-q));

        double x2 = - p/2 + Math.sqrt((Math.pow(p/2,2)-q));

        System.out.println(x1);
        System.out.println(x2);
    }
}
