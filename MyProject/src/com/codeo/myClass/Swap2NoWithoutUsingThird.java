package com.codeo.myClass;

public class Swap2NoWithoutUsingThird {

	public static void main(String[] args) {
int a=3;
int b=6;
System.out.println("a: " +a+" b: "+b);
a=a+b;//==> a=9
b=a-b;//==>b=3
a=a-b;// ==>a=6
System.out.println("a: " +a+" b: "+b);

	}

}
