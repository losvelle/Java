package javaHomework;

public class Mod3wk1Hw1 {

	public static void main(String[] args) {
//		creating a random number generator to throw numbers between 0 & 23 to represent the time of the day if 
//		the console prints "true" that means that the parrot is awake and scared.
		
		int randnum = (int)(Math.random()*23); 
		System.out.println(randnum);
		System.out.println(getUp(true, randnum));

	}

//	creation of a new method called getUp that has 2 parameters one thats boolean and the other is an integer
	
	static boolean getUp(boolean squawking, int currentHour) {
	
		if(currentHour < 6 || currentHour >= 22)
			return squawking = true;
		else
			return squawking = false;
}
}