import java.io.IOException;

public class GeometrischeReihe {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie den Endexponenten ein:");
        int ende = IO.readInt();

        double gReihe;

        for (int i = 1; i <= ende; i++) {
            gReihe = (1/Math.pow(2,i));
            System.out.println(gReihe);

        }

    }
}
