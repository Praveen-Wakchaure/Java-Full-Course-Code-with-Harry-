package ch16_AdvanceJava_2;

interface DemoAno
{
	void method1();
	void method2();
}

public class AnonymousClass_109 {

	public static void main(String[] args) {

		DemoAno da = new DemoAno() {                  //This is the Anonymous class of the DemoAno
			
			@Override
			public void method1() {
				System.out.println("This is method 1");
				
			}
			
			@Override
			public void method2() {
				System.out.println("This is method 1");	
			}
		};                                           //Semicolon is necessary at the end of anonymous class

		da.method1();
		da.method2();
	}

}
