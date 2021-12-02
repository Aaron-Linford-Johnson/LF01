import java.io.IOException;

public class TestArrwayString {
    public static void main(String[] args) throws IOException {


        System.out.println("...");
        String[] test =  IO.readArrayString();

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

    }

}
