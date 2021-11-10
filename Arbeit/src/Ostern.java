import java.io.IOException;

public class Ostern {
    public static void main(String[] args) throws IOException {

        System.out.print("Geben sie die Jahreszahl ein: ");
        int jahr = IO.readInt();

        int n = 0;
        int m = 0;

        if (jahr >= 1583 && jahr <= 1699) {
            m = 23;
            n = 2;
        }
        else if (jahr >= 1700 && jahr <=1799){
            m = 23;
            n = 3;
        }
        else if (jahr >=1800 && jahr <=1899) {
            m = 23;
            n = 4;
        }
        else if (jahr >= 1900 && jahr <= 2099) {
            m = 24;
            n = 5;
        }
        else if (jahr >= 2100 && jahr <= 2199) {
            m = 24;
            n = 6;
        }

        int restA = jahr % 19;
        int restB = jahr % 4;
        int restC = jahr % 7;
        int restD = (19 * restA + m) / 30;
        int restE = (2 * restB + 4 * restC + 6 * restD + n) % 7;

        int ostern1 = 22 + restD + restE;
        int ostern2 = restD + restE - 9;

        if (ostern1 == 26 ){
            System.out.println("Ostern ist am 19 April.");
        }
        if (ostern1 <=31 ){
            System.out.println("Ostern ist am "+ostern1 +" März.");
        }
        else
            System.out.println("Ostern ist am "+ostern2 +" April.");

        if (ostern1 == 26 ) {
            System.out.println("Ostern ist am 19 April.");
        } else if (restD == 28 && restE == 6 &&( 11*m+11 % 30) <19 = 25) {
            System.out.println("Ostern i9st am 18 April.");
        }
    }
}

