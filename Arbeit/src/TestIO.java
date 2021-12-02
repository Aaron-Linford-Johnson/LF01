import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        boolean wiederholen;
       do {
           System.out.println("Wie ist das Wetter heute?");
           String wetter = IO.readString();
           System.out.println("Das Wetter ist heute " + wetter);

           System.out.println("Wie alt bist du?");
           int alter = IO.readInt();
           System.out.println("Du bist " + alter + " Jahre alt");

           System.out.println("Wie wie weit bist du gelaufen? ( in Meter)");
           double laufen = IO.readDouble();
           System.out.println("Du bist " + laufen + " Meter gelaufen");

           System.out.println("Wollen sie jetzt bezahlen? ");
           boolean bezahlen = IO.readBoolean();
           if (bezahlen) {
               System.out.println("Danke für ihren Einkauf");
           } else {
               System.out.println("OK");
           }
           System.out.println("Wollen sie das Programm wiederholen?");
           wiederholen = IO.readBoolean();

       } while (wiederholen);
    }
}


