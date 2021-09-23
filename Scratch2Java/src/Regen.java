public class Regen {
    public static void main(String[] args) {
        // Dekleration und Initialisierung (erstmalige Wertzuweisung) bzw. Wertzuweisung
        double regenImApril = 13.4;
        double regenImMai = 14.6;
        double regenImJuni = 8.3;
        // Rechenen
        double mittelwert = (regenImApril + regenImMai + regenImJuni) /3;
        // Ausgabe des Ergebnisses
        System.out.println("Regen im April\t: \t"+regenImApril);
        System.out.println("Regen im Mai  \t: \t"+regenImMai);
        System.out.println("Regen im Juni \t: \t"+regenImJuni);
        System.out.println("Mittelwert    \t: \t"+mittelwert);


    }
}
