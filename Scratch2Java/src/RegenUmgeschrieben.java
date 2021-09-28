import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegenUmgeschrieben {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Niederschlagsmenge im Monat April?");
        String eingabe = br.readLine();
        double april = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.println("Niederschlagsmenge im Monat Mai?");
        eingabe = br.readLine();
        double mai = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.println("Niederschlagsmenge im Monat Juni?");
        eingabe = br.readLine();
        double juni = Double.parseDouble(eingabe.trim().replace(',','.'));

        double durchschnitt = (april + mai + juni)/3;

        System.out.println("Die durchschnittsmenge Niederschlagsmenge für die drei Monate beträgt: "+durchschnitt);
        //April 13.4
        //Mai 14.6
        //Juni 8.3
        //Durchschnitt 12.1


    }



}
