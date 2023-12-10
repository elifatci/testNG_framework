package utilities;

public class ReusableMethods {


    public static void Wait(int second){

        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
