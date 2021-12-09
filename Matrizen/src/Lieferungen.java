import java.io.IOException;

public class Lieferungen {
    public static void main(String[] args) throws IOException {
        int[][] test = tabelle();
        ausgebenTabelle(test);

        int[][] test2 = tabelle();
        ausgebenTabelle(test2);

        int[][] test10 = addierenTabelle(test,test2);

        ausgebenTabelle(test10);






    }
    private static int[][] tabelle() throws IOException {
        System.out.println("Wie viel Artikel wurden ausgeliefert?");
        int artikel = IO.readInt();
        System.out.println("An wie viele Kunden wurden sie ausgeliefert?");
        int kunden = IO.readInt();
        int[][] tabelle = new int [artikel][kunden];

        for (int i = 0; i < tabelle.length; i++){
            for (int j = 0; j < tabelle[i].length; j++) {
                System.out.println("Wie viel hat Kunde " + (i+1) + " von Artikel " + (j+1) + " bestellt.");
                tabelle[i][j] = IO.readInt();
            }
            System.out.println();
            System.out.println();
        }
        return tabelle;
    }
    private static void ausgebenTabelle(int[][] tabelle){
        System.out.print("Summe \t\t\t");
        for (int i = 0; i < tabelle.length; i++){
            System.out.print("Kunde " + (i + 1) + "\t\t");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < tabelle.length; i++){
            System.out.print("Artikel " + (i+1));
            for (int j = 0; j < tabelle[i].length; j++){
                System.out.print("\t\t\t" + tabelle[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }
    private static int[][] addierenTabelle(int[][] tabelle,int[][] tabelle2){
        int[][] endTabelle = new int [tabelle.length][tabelle2.length];
        for (int i = 0; i < tabelle.length; i++){
            for (int j = 0; j < tabelle[i].length; j++ ){
                endTabelle[i][j] = tabelle[i][j] + tabelle2[i][j];
            }
            System.out.println();
        }
        return endTabelle;
    }
}
