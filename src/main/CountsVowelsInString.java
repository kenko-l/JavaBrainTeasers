package main;
import java.util.Scanner;
public class CountsVowelsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char v = Character.toLowerCase(input.charAt(i));
			
			if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
				count++;
			}
		}
		
		System.out.println("You have " + count + "vowels in your word");
		

	}

}
