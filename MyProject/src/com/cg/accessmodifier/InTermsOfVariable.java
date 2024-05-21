package com.cg.accessmodifier;

import java.util.Scanner;

public class InTermsOfVariable {
	
	
	public InTermsOfVariable() {
		
	}

	//variable
	//default variable is accessible throughout the package
	//defaultvariable is not accessible throughout the project
    int a=3;
 
	//public variable is accessible throughout package
	//publicvariable isaccessible throughout the projectbut notoutsidethe project
	public int i=4;
	//private variables is not accessiblethroughout the ppackage
	//only in class
	private int e=6;
	//by using concept ofdata encapsulation
	
	protected int r=8;
	//protected variable is accessible throughout the package
     //protected variable is not accessible throughout the project
 
}
