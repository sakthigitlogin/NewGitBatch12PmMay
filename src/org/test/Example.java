package org.test;

public class Example {

	int a = 100;
	int b = 20;

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	private void display() {
		System.out.println("B method ");
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}
}
