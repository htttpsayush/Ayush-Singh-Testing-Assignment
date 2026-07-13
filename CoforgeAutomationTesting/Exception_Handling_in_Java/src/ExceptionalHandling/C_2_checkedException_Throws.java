package ExceptionalHandling;

public class C_2_checkedException_Throws {
    int x = 143;

    public void m1() {
        System.out.println("Value of x is: " + x);
    }

    public static void main(String[] args) throws InterruptedException {

    	C_2_checkedException_Throws obj =
                new C_2_checkedException_Throws();

        obj.m1();
        Thread.sleep(0);
    }
}