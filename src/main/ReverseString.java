package main;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String reversed = "";
		
		for(int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		
		System.out.println("Reversed string: " + reversed);
		
	}

}