import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geben sie die erste Zahl ein: ");
        String eingabe = br.readLine();
        double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.print("Geben sie die zweite Zahl ein: ");
        eingabe = br.readLine();
        double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));


        System.out.println("Mit welchen rechenoperator wollen sie rechnen (+/ - / * / oder /)");
        String rechenoperator = br.readLine();


        if (rechenoperator.equals("+")){
            System.out.println("Das Ergebnis ist: "+ (zahl1+zahl2));

        }
        else if (rechenoperator.equals("-")){
            System.out.println("Das Ergenis ist: "+(zahl1-zahl2));
        }
        else if (rechenoperator.equals("*")){
            System.out.println("Das Ergebnis ist: "+(zahl1*zahl2));
        }
        else if (rechenoperator.equals("/")){
            System.out.println("Das Ergebnis ist: "+(zahl1/zahl2));


            }

        }


    }

