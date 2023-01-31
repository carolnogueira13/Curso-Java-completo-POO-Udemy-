package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("\nFirst: " + ps.first());
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}