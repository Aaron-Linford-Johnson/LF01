public class TaschenrechnerOhneAusgabe {
    public static void main(String[] args) {

        //Deklarierung
        double zahlX;
        double zahlY;
        double plus;
        double minus;
        double geteilt;
        double mal;


        //Initialisierung und Rechnen

        zahlX = 10.5;
        zahlY = 5.5;
        plus = zahlX + zahlY;
        minus = zahlX - zahlY;
        geteilt = zahlX/zahlY;
        mal = zahlX*zahlY;

        //Ausgabe

        System.out.println("ZahlX \t\t= \t"+zahlX);
        System.out.println("ZahlY \t\t= \t"+zahlY);
        System.out.println("Summe \t\t= \t"+plus);
        System.out.println("Differenz \t= \t"+minus);
        System.out.println("Produkt \t= \t"+mal);
        System.out.println("Quotient \t= \t"+geteilt);








    }
}
