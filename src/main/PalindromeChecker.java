package main;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();
        
        boolean palindrome = true;
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                palindrome = false;
                break;
            }
        }
		
		if(palindrome) {
			System.out.print("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}
		
	sc.close();
	
	}

}





