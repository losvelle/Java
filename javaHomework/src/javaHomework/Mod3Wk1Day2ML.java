package javaHomework;

public class Mod3Wk1Day2ML {

	public static void main(String[] args) {
		int randnum1 = (int)(Math.random()*100);
		int randnum2 = (int)(Math.random()*100);
		int randnum3 = (int)(Math.random()*100);
		
		System.out.println("This is number 1: "+ randnum1);
		System.out.println("This is number 2: "+ randnum2);
		System.out.println("This is number 3: "+ randnum3);
		
		
		System.out.println("REQUIREMENT 1 ###############################################");
		
			System.out.println("The Largest of the first two numbers is " + maxOfTwoNumbers(randnum1, randnum2));
		
		System.out.println("REQUIREMENT 2 ###############################################");
		
			System.out.println("The Largest of the three numbers is " + maxOfThreeNumbers(randnum1, randnum2, randnum3));
		
		System.out.println("REQUIREMENT 3 ###############################################");
			char onlyOneLetter = 'e';
			System.out.println("True or False was the letter entered a vowel? " + isCharacterAVowel(onlyOneLetter));
			
		System.out.println("REQUIREMENT 4 ###############################################");
			
			String lenghtOfString = "I think this is working";
			System.out.println("The length of this string is : " + charCount(lenghtOfString));
			
		System.out.println("REQUIREMENT 5 ###############################################");
			String vowelToBeCounted = "Enter you words here";
			System.out.println("The string inside the function has " + vowelCount(vowelToBeCounted) + " vowels");
			
			
	}
	
//	Write a method maxOfTwoNumbers that takes two numbers as arguments and returns the largest of them.
	
	static int maxOfTwoNumbers(int x, int y){
		if(x >= y)
			return x;
		else
			return y;
	}
	
//	Write a function maxOfThree that takes three numbers as arguments and returns the largest of them.

	static int maxOfThreeNumbers(int x, int y, int z){
		if(x >= y && x >= z)
			return x;
		
		else if (y >= x && y >= z)
			return y;
		
		else
			return z;
	}
	
	
//	Write a function isCharacterAVowel that takes a character (i.e. a string of length 1) and returns true if it is a vowel, false otherwise.
//	In Java, you use double quotes (" ") for strings and single quotes (' ') for characters.
	
	static boolean isCharacterAVowel(char x) {
		if( x == 'a'|| x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U' )
			return true;
		else
			return false;
	}
	
	
	
//	Write a function charCount that takes a string and returns the length of the string.
	
	
	static int charCount(String str) {
		int charCount = 0;
		for(int i = 0; i < str.length(); i++)
			charCount++;
		return charCount;
		
		}
	
//	Write a function vowelCount that takes a String and returns the number of vowels in the String. 
//	add a check for the string to be of 10 or less characters. 
	
	static int vowelCount(String str1) 
    { 
        int count = 0; 
        for (int i = 0; i < str1.length(); i++) 
            if (isCharacterAVowel(str1.charAt(i))) // Check for vowel using previous method created
                ++count; 
        return count; 
	
	
	
	}}


