package pmyfirst;

import java.util.Random;

public class MyFirstApp {
	private static int number;
	
	public static void main(String[] args) {
		System.out.println("My first line");
		System.out.println(Math.PI);
		
		Random generator = new Random();
		int dice = (generator.nextInt(6)+1);
		System.out.println(dice);
		System.out.println("Number is a static class variable");
		number = 5;

	}

}
