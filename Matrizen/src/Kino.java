import java.io.IOException;

public class Kino {
    public static void main(String[] args) throws IOException {
        String[][] saal = erzeugenSaal();
        anzeigenSaal(saal);
        reservierenPlatz(saal);
        stornierenPlatz(saal);

    }
    private static String[][] erzeugenSaal() throws IOException {
        System.out.print("Wie viele Reihen: ");
        int reihe = IO.readInt();
        System.out.print("Wie viele Plätze pro Reihe: ");
        int plätze = IO.readInt();
        String[][] platz = new String[reihe][plätze];

        return platz;
    }
    private static void anzeigenSaal(String[][] saal){
        for (int i = 0; i < saal.length; i++){
            System.out.println();
            for (int j = 0; j < saal[i].length; j++){
                saal[i][j] = "O";
            }
        }
        for (int i = 0; i < saal.length; i++){
            System.out.println();
            for (int j = 0; j < saal[i].length; j++ ){
                System.out.print(saal[i][j] + "\t");
            }
        }
    }
    private static void reservierenPlatz(String[][] saal) throws IOException {
        boolean wiederholen;

        do {
            System.out.println();
            System.out.println("Welcher Platz soll reserviert werden: ");
            System.out.print("Geben sie die Reihe an: ");
            int rReihe = IO.readInt();

            System.out.print("Geben sie den Platz in der Reihe ein: ");
            int rPlatz = IO.readInt();


            for (int i = 0; i < saal.length; i++) {
                System.out.println();
                for (int j = 0; j < saal[i].length; j++) {
                    saal[rReihe][rPlatz] = "X";
                }
            }
            for (int i = 0; i < saal.length; i++) {
                System.out.println();
                for (int j = 0; j < saal[i].length; j++) {
                    System.out.print(saal[i][j] + "\t");
                }
            }
            System.out.println("Wollen sie einen weiteren Platz reservieren?");
            wiederholen = IO.readBoolean();
        } while (wiederholen);
    }
    private static void stornierenPlatz(String[][] saal) throws IOException {
        boolean wiederholen;

       do {
           System.out.println("Wollen sie eine Reservierung stornieren");

           boolean stornieren = IO.readBoolean();

           if (stornieren) {
               System.out.println("Aktueller Belegungsplan:");

               for (int i = 0; i < saal.length; i++) {
                   System.out.println();
                   for (int j = 0; j < saal[i].length; j++) {

                   }
               }
               for (int i = 0; i < saal.length; i++) {
                   System.out.println();
                   for (int j = 0; j < saal[i].length; j++) {
                       System.out.print(saal[i][j] + "\t");
                   }
               }
           }
           System.out.println("Welcher Platz soll stoniert werden?");

           System.out.print("Geben sie die Reihe an: ");
           int rReihe = IO.readInt();

           System.out.print("Geben sie den Platz in der Reihe ein: ");
           int rPlatz = IO.readInt();

           for (int i = 0; i < saal.length; i++) {
               System.out.println();
               for (int j = 0; j < saal[i].length; j++) {
                   saal[rReihe][rPlatz] = "0";

               }
           }
           for (int i = 0; i < saal.length; i++) {
               System.out.println();
               for (int j = 0; j < saal[i].length; j++) {
                   System.out.print(saal[i][j] + "\t");
               }
           }
           System.out.println("Wollen sie einen weiteren Platz Stornieren?");
           wiederholen = IO.readBoolean();
       } while (wiederholen);
    }
}
