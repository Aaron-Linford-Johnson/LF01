import java.io.IOException;

public class Fakultaet {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie die Endzahl ein: ");
        int ende = IO.readInt();
        int i;
        int fact = 1;

        for (i = 1; i <= ende ; i++) {
            fact = fact * i;

        }
        System.out.println( "Die Fakultät von "+ende+" ist: "+fact);


    }
}
