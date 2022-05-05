package org.test;

public class Example {

	int a=100;
	int c=200;
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	private void display() {
		System.out.println("B method ");
	}
	
	private void print() {
		System.out.println("Print method : C ");
	}


	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("Done");
	}
}
