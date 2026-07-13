package ExceptionalHandling;

public class C_1_checkedException {
	
	int x =10;
	
	public void m1() {
		System.out.println("value of x is :-" + x);
		
	}

	public static void main(String[] args) {
		
		C_1_checkedException obj = new C_1_checkedException();
		
		obj.m1();
		
		try {
			Thread.sleep(1000);
			
		} catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}
