package week04Collections;

public class Week04Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. a, b
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		int diff = ages[ages.length -1];
		
		System.out.println(diff - ages[0]);		
		
		
		//1. c 		
		double total = 0; 
		
		for (int age : ages) {
			total += age;
		}
		
		double average = total / ages.length;
		
		System.out.println(average);
		
		
		//2. a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double totalChars = 0;
		
		for (String name : names) {
			totalChars += name.length();}
		
		double averageChars = totalChars / names.length;
		
		System.out.println(averageChars);
		
		
		//2. c
		System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5]);
		
		
		//3. 
		// arrayName.lenght-1
		
		
		//4. 
		// array[0]
		
	}

}
