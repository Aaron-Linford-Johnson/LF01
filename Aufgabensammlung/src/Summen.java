import java.io.IOException;

public class Summen {
    public static void main(String[] args) throws IOException {

        int gerade = 0;
        int summeGerade = 0;
        int ungrade = 0;
        int summeUngerade = 0;

        int[] array = IO.readIntArray();

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                gerade++;
                summeGerade = summeGerade + array[i];
            }
            else {
                ungrade++;
                summeUngerade = summeUngerade + array[i];
            }
        }
        System.out.println("Gerade zahlen:");
        System.out.println("Anzahl = " + gerade);
        System.out.println("Summe = " + summeGerade);
        System.out.println("Ungerade zahlen:");
        System.out.println("Anzahl = " + ungrade);
        System.out.println("Summe = " + summeUngerade);
    }
}
