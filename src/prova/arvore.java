package prova;

import java.util.InputMismatchException;
import java.util.Scanner;

public class arvore {

	public static void main(String[] args) {
	
		met1();
		
		System.out.println("end of program.");
		
}
		public static void met1 () {
			System.out.println("******* METHODO2 START *******");
			met2();
			System.out.println("******* METHODO2 END *******");
		}
	
		public static void met2 () {
			System.out.println("******* METHODO1 START *******");
			Scanner sc = new Scanner(System.in);
			
			try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException w) {
				System.out.println("Invalid position");
				w.printStackTrace();
			}
			catch(InputMismatchException w) {
				System.out.println("Input error");
			}
			sc.close();
			System.out.println("******* METHODO1 END *******");
		}
}
