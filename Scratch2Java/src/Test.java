import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bist du bereit für den Test? Dann schreib Ja");
        String eingabe = br.readLine();



        double Punktzahl = 0;

        // Frage 1
        System.out.println("8 * 8");
        System.out.println("A) 64");
        System.out.println("B) 87");
        System.out.print("= ");
        String antworten = br.readLine();
        double A1 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A1 == 64) {
            Punktzahl++;
        }
        //Frage 2
        System.out.println("40 + 35");
        System.out.println("A) 70");
        System.out.println("B) 50");
        System.out.println("C) 75");
        System.out.print("= ");
        antworten = br.readLine();
        double A2 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A2 == 75) {
            Punktzahl++;
        }
        //Frage 3
        System.out.println("80 * 4");
        System.out.println("A) 320");
        System.out.println("B) 230");
        System.out.println("C) 28277 Braaaa");
        System.out.print("= ");
        antworten = br.readLine();
        double A3 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A3 == 320) {
            Punktzahl++;
        }
        //Frage 4
        System.out.println("187 + 187");
        System.out.println("A) 187");
        System.out.println("B) 456");
        System.out.println("C) 374");
        System.out.print("= ");
        antworten = br.readLine();
        double A4 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A4 == 374) {
            Punktzahl++;
        }

        //Frage 5
        System.out.println("1 * 15 + 88");
        System.out.println("A) 108");
        System.out.println("B) 103");
        System.out.println("C) 105");
        System.out.print("= ");
        antworten = br.readLine();
        double A5 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A5 == 103) {
            Punktzahl++;
        }

        //Frage 6
        System.out.println("5 + 5 * 3");
        System.out.println("A) 30");
        System.out.println("B) 25");
        System.out.println("C) 20");
        System.out.print("= ");
        antworten = br.readLine();
        double A6 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A6 == 20) {
            Punktzahl++;
        }

        //Frage 7
        System.out.println("5 + 10 * 5 - 50");
        System.out.println("A) 5");
        System.out.println("B) 100");
        System.out.println("C) -50");
        System.out.print("= ");
        antworten = br.readLine();
        double A7 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A7 == 5) {
            Punktzahl++;
        }

        //Frage 8
        System.out.println("1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1");
        System.out.println("A) 20");
        System.out.println("B) 30");
        System.out.println("C) Was das für eine Behinderte Aufgabe man!!!");
        System.out.print("= ");
        antworten = br.readLine();
        double A8 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A8 == 30) {
            Punktzahl++;
        }

        //Frage 9
        System.out.println("10 * 10");
        System.out.println("A) 187");
        System.out.println("B) 456");
        System.out.println("C) 100");
        System.out.print("= ");
        antworten = br.readLine();
        double A9 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A9 == 100) {
            Punktzahl++;
        }

        //Frage 10
        System.out.println("1 + 1");
        System.out.println("A) 1");
        System.out.println("B) 1");
        System.out.println("C) 1");
        System.out.print("= ");
        antworten = br.readLine();
        double A10 = Double.parseDouble(antworten.trim().replace(',','.'));

        if (A10 == 187) {
            Punktzahl++;
        }

        if (Punktzahl == 10) {
            System.out.println("Du hast "+Punktzahl +" von 10 Punkten erreicht. Du bist sehr schlau und dich erwartet eine goldene Zukunft!");
        }else
            if (Punktzahl == 9) {
                System.out.println("Du hast "+Punktzahl +" von 10 Punkten erreicht. Du bist dumm! Wie kann man Aufgabe 10 falsch haben??? Überleg dir gut ob MATA wirklich das richtige für die ist!");

            }


    }

}

