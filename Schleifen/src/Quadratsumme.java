import java.io.IOException;

public class Quadratsumme {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie die Endzahl ein: ");
        int ende  = IO.readInt();

        int qSumme;
        int i;


        for (i = 1; i <= ende; i++) {

           qSumme = (int) Math.pow(i,2);
            System.out.println(i+ " hoch 2 = "+qSumme);

        }


    }
}
