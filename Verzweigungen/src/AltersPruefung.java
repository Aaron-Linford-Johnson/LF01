import java.io.IOException;

public class AltersPruefung {
     public static void main(String[] args) throws IOException {

         System.out.print("Wie alt bist du?: ");
         int alter = IO.readInt();

         if (alter <= 17) {
             System.out.println("Du bist noch minderjährig!");
         }
         else System.out.println("Du bist schon volljährig!");

    }



}
