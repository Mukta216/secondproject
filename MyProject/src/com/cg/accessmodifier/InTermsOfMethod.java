package com.cg.accessmodifier;

public class InTermsOfMethod {
//default method
	//IT can be accessible throughout the package
	//Itisnot accessible outside package
	
	void myMethod() {
		System.out.println("my method");
	}
		int myMethod1() {
			return 45;
			
		}
		public void myPublic() {
			System.out.println("Hello");
			System.out.println(Math.random());
		}
	private void myPrivateMethod() {
		System.out.println("My Private Method");
	}

}
