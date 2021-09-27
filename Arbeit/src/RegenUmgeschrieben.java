import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegenUmgeschrieben {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String eingabe = br.readLine();
        System.out.println("Niederschlagsmenge im Monat April?");
        double april = Double.parseDouble(eingabe.trim().replace(',','.'));
        System.out.println("Niederschlagsmenge im Monat Mai?");
        double mai = Double.parseDouble(eingabe.trim().replace(',','.'));
        System.out.println("Niederschlagsmenge im Monat Juni?");
        double juni = Double.parseDouble(eingabe.trim().replace(',','.'));

        double durchschnitt = april + mai + juni/3;

        System.out.println("Die durchschnittsmenge Niederschlagsmenge für die drei Monate beträgt: "+durchschnitt);


    }



}
