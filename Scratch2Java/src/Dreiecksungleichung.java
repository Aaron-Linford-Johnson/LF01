import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nenne mir die Seitenlänge von a (Ohne cm): ");
        String eingabe = br.readLine();
        double seiteA = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.print("Nenne mir die Seitenlänge von b (Ohne cm): ");
        eingabe = br.readLine();
        double seiteB = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.print("Nenne mir die Seitenlänge von c (Ohne cm): ");
        eingabe = br.readLine();
        double seiteC = Double.parseDouble(eingabe.trim().replace(',','.'));

        if (seiteA + seiteB > seiteC && seiteA + seiteC > seiteB && seiteB + seiteC > seiteA) {
            System.out.println("Das zeichnen eines Dreieckes ist möglich.");
            double Umfang = seiteA + seiteB + seiteC;
            System.out.println(" Der Umfang ist = " + Umfang);
            double s = Umfang / 2;
            double wurzel = Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
            double hoeheMitA = seiteA * wurzel / 2;
            double hoeheMitB = seiteB * wurzel / 2;
            double hoeheMitC = seiteC * wurzel / 2;

            if (seiteA > seiteB && seiteA > seiteC) {
                System.out.println("Der Flächeninhalt (mit a als Grundseite) ist = " + hoeheMitA);
            }
            else if (seiteB > seiteA && seiteB > seiteC) {
                System.out.println("Der Flächeninhalt (mit b als Grundseite) ist = " + hoeheMitB);
            }
            else if (seiteC > seiteA && seiteC > seiteB) {
                System.out.println("Der Flächeninhalt (mit c als Grundseite) ist = " + hoeheMitC);
            }

        }
        else {
            System.out.println("Das zeichnen eines Dreieckes ist nicht möglich.");
        }


    }

}

