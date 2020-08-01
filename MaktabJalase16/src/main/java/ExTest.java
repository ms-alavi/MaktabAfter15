import java.io.IOException;

public class ExTest extends Exception {
    public ExTest() {
    }

    public ExTest(String message) {
        super(message);
    }


}
class Test{
    public static void main(String[] args) {

        try {
           // f(0);
           // f(-1);
            f(5);
        }catch (Exception e) {System.out.println(e.getMessage());}

    }
    public static int f(int a)throws Exception{
        if (a==0)throw new ExTest("zero");
        if (a<0)throw new IOException("Negative");
        return a;

    }

}
