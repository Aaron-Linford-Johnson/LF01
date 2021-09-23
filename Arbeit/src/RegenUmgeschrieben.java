import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegenUmgeschrieben {
    public static void main(String[] args) throws IOException {
        System.out.println(" Wie ist die Regenmenge im April?");
        double regenImApril = 13.4;
        double regenImMai = 14.6;
        double regenImJuni = 8.3;

        double mittelwert = (regenImApril + regenImMai + regenImJuni) /3;

        System.out.println("Regen im April\t: \t"+regenImApril);
        System.out.println("Regen im Mai  \t: \t"+regenImMai);
        System.out.println("Regen im Juni \t: \t"+regenImJuni);
        System.out.println("Mittelwert    \t: \t"+mittelwert);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        double april = Double.parseDouble(april.trim())

    }



}
