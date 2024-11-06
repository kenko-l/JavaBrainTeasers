package main;
import java.util.Scanner;
public class CountsVowelsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char vowel = Character.toLowerCase(input.charAt(i));
			
			if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
				count++;
			}
		} 
		
		System.out.println("You have " + count + "vowels in your word");
		

	}

}
