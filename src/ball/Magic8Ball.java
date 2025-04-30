package ball;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] response = { // array of 20 responses
				"It is certain",
				"Without a doubt",
				"Yes, definitely",
				"Yes",
				"No",
				"Dont count on it",
				"My reply is no",
				"Very doubtful",
				"Most likely",
				"Ask again later",
				"Its best not to know",
				"Try Again",
				"Cant predict it at the moment",
				"Better to not say",
				"Dont doubt it",
				"Of course",
				"Of course not",
				"Better luck next time",
				"Signs point to yes",
				"Signs point to no",
		};
		
		System.out.println("---------Welcome to Magic 8 Ball!!!----------");
		System.out.println("Ask a Yes/No question or type 'quit' to leave.");
		
		//loop will keep asking for questions until user says quit\
		while (true) {
			System.out.println("\nAsk a question: ");
			String question = scan.nextLine().trim(); 
			
		//this will check if user inputs quit
			if(question.equalsIgnoreCase("quit")) {
				System.out.println("Thank You! Have a Good Day.");
				break;
			}
			
			//selects a random response from array 
			int randomIn = ran.nextInt(response.length);
			String responses = response[randomIn];
			
			//output the responses
			System.out.println("Magic 8 Ball: " + responses);
		}
		scan.close();
	}
}