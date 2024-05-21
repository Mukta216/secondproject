package com.codeo.myClass;

import com.cg.accessmodifier.InTermsOfMethod;
import com.cg.accessmodifier.InTermsOfVariable;

public class Demo {

	public static void main(String[] args) {
		InTermsOfVariable itov=new InTermsOfVariable();
		//System.out.println(itov.r);
		
		InTermsOfMethod itof=new InTermsOfMethod();
		//itof.myMethod();
		itof.myPublic();
	}

}
