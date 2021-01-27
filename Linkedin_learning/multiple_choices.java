// Linkedin learning - Learning Java
// Sample solution: Multiple choices
// https://www.linkedin.com/learning/learning-java-4/sample-solution-multiple-choice?contextUrn=urn%3Ali%3AlyndaLearningPath%3A56d8919392015a1a081f9141

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String question = "What is the largest planet in solar system?";
		String choiceOne = "Earth";
		String choiceTwo = "Jupiter";
		String choceThree = "Saturn";

		String correctAnswer = choiceTwo;

		// Write a print statement asking the question
		System.out.println(question);

		// Write a print statement giving the answer choices
		System.out.println("Choose one of the following: " + 
		choiceOne + " " + choiceTwo + ", or " + choceThree + ".");

		// Have the user input an answer
		Scanner scanner = new Scanner(System.in);

		// Retrieve the user's input
		String input = scanner.next();

		// If the user's input matches the correctAnswer...
		// then the user is correct ans we want to print out a congrats message to the user
		if(correctAnswer.equals(input)) {
			System.out.println("Correct answer!");
		}
		else {
			System.out.println("You are incorrect! The correct answer is " + correctAnswer);
		}
	}
}
