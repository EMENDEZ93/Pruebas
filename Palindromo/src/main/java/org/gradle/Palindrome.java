package org.gradle;

public class Palindrome {

	public String isIt(String word) {
		
		String message = "";
		
		if(word != null) {
		
			if(word.trim().equals(new StringBuilder(word.trim()).reverse().toString())) {
				message = "Es palindromo !!!";
			} else if (!word.trim().equals(new StringBuilder(word.trim()).reverse().toString())) {
				message = "No es palindromo !!!";
			}

			return message;
		}
		return "No es palindromo !!!";	
	}

}
