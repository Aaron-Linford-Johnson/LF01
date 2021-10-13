import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerFinale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String wiederholen = null;

        do {
            //Menü

            schreibeMenue();
            String menue = br.readLine();

            //Rechnung & Ausgabe
                                    //Addition
            if (menue.equals("+")){
                addition();


            }                            //Subtraktion
            else if (menue.equals("-")){
                System.out.print("Geben sie die erste Zahl ein: ");
                String eingabe = br.readLine();
                double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.print("Geben sie die zweite Zahl ein: ");
                eingabe = br.readLine();
                double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.println("Das Ergebnis ist: "+(zahl1-zahl2));


            }                            //Multiplikation
            else if (menue.equals("*")){
                System.out.print("Geben sie die erste Zahl ein: ");
                String eingabe = br.readLine();
                double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.print("Geben sie die zweite Zahl ein: ");
                eingabe = br.readLine();
                double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.println("Das Ergebnis ist: "+(zahl1*zahl2));


            }                            //Division
            else if (menue.equals("/")){
                System.out.print("Geben sie die erste Zahl ein: ");
                String eingabe = br.readLine();
                double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.print("Geben sie die zweite Zahl ein: ");
                eingabe = br.readLine();
                double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.println("Das Ergebnis ist: "+(zahl1/zahl2));



            }                            //Potenzieren
            else if (menue.equalsIgnoreCase("p")){
                System.out.print("Geben sie die Basis ein: ");
                String eingabe = br.readLine();
                double basis = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.print("Geben sie den Exponenten ein: ");
                eingabe = br.readLine();
                double exponent = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.println(basis +"Hoch "+exponent+"= "+(Math.pow(basis,exponent)));


            }                            //Wurzelziehen
            else if (menue.equalsIgnoreCase("w")){
                System.out.print("Geben sie die Zahl ein: ");
                String eingabe = br.readLine();
                double wurzel = Double.parseDouble(eingabe.trim().replace(',','.'));

                System.out.println("Die Wurzel von "+wurzel+" ist = "+(Math.sqrt(wurzel)));
        }
            //Wiederholen
            System.out.println("wollen sie noch eine Rechnung durchführen, dann geben sie [j] ein für Ja oder [n] ein für Nein.");
            wiederholen = br.readLine();

        } while (wiederholen.equals("j"));

}
private static void schreibeMenue (){
    System.out.println("[+] für Addition");
    System.out.println("[-] für Subtraktion");
    System.out.println("[*] für Multiplikation");
    System.out.println("[/] für Division");
    System.out.println("[p] für Potenzieren");
    System.out.println("[w] für Wurzelziehen");
    System.out.print("Wählen sie ein Rechenoperator aus: ");
}
private static void addition () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
    System.out.print("Geben sie die erste Zahl ein: ");
    String eingabe = br.readLine();
    double zahl1 = Double.parseDouble(eingabe.trim().replace(',','.'));

    System.out.print("Geben sie die zweite Zahl ein: ");
    eingabe = br.readLine();
    double zahl2 = Double.parseDouble(eingabe.trim().replace(',','.'));

    System.out.println("Das Ergebnis ist: "+ (zahl1+zahl2));
}
}
