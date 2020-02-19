import java.util.Scanner;
import java.util.ArrayList;

public class QuizGame {
	static ArrayList<Question> mathQs = new ArrayList<Question>();
	static ArrayList<Question> histQs = new ArrayList<Question>();
	
	public static void createMathQuestions() {
		mathQs.add(new Question(1, "What is 3+8*2/4-6?", "-11", "1", "-0.5", "2", "B"));
		mathQs.add(new Question(2, "What is the square root of 64?", "8", "6", "9", "32", "A"));
		mathQs.add(new Question(3, "What is the square root of -9?", "-3", "i", "3i", "-3i", "C"));
		mathQs.add(new Question(4, "If a right triangle has legs of lengths 6 and 8, what is the length of the hypotenuse?", "7", "10", "14", "48", "B"));
		mathQs.add(new Question(5, "What is the sine of a 30 degree angle?", "1/2", "sqrt(3)/2", "1", "sqrt(2)/2", "A"));
	}
	public static void createHistoryQuestions() {
		histQs.add(new Question(1, "Who was the first U.S. President?", "Thomas Jefferson", "Benjamin Franklin", "James Madison", "George Washington", "D"));
		histQs.add(new Question(2, "When did the American Civil War Start?", "1776", "1861", "1917", "1848", "B"));
		histQs.add(new Question(3, "Where was the final major battle of the American Revolution", "Concord", "Valley Forge", "Yorktown", "Williamsburg", "C"));
		histQs.add(new Question(4, "Who commanded the Allied forces at the Invasion of Normandy (D-Day)?", "Churchill", "Eisenhower", "MacArthur", "Truman", "B"));
		histQs.add(new Question(5, "When was the Cuban Missile Crisis", "October 1962", "July 1969", "June 1959", "November 1963", "A"));
	}
	public static void displayMathQuestions() {
		createMathQuestions();
		Scanner mathAns = new Scanner(System.in);
		String currAns;
		int numCorrect = 0;
		for(int i = 0; i < mathQs.size(); i++) {
			System.out.println(mathQs.get(i).getNum() + ". " + mathQs.get(i).getQuestion());
			System.out.println("A. " + mathQs.get(i).getA());
			System.out.println("B. " + mathQs.get(i).getB());
			System.out.println("C. " + mathQs.get(i).getC());
			System.out.println("D. " + mathQs.get(i).getD());
			currAns = mathAns.nextLine();
			if(currAns.equals(mathQs.get(i).getCorrect())) {
				numCorrect++;
			}
		}
		mathAns.close();
		System.out.println("You scored a " + numCorrect + " out of 5 on this quiz!");
	}
	public static void displayHistoryQuestions() {
		createHistoryQuestions();
		Scanner histAns = new Scanner(System.in);
		String currAns;
		int numCorrect = 0;
		for(int i = 0; i < histQs.size(); i++) {
			System.out.println(histQs.get(i).getNum() + ". " + histQs.get(i).getQuestion());
			System.out.println("A. " + histQs.get(i).getA());
			System.out.println("B. " + histQs.get(i).getB());
			System.out.println("C. " + histQs.get(i).getC());
			System.out.println("D. " + histQs.get(i).getD());
			currAns = histAns.nextLine();
			if(currAns.equals(histQs.get(i).getCorrect())) {
				numCorrect++;
			}
		}
		histAns.close();
		System.out.println("You scored a " + numCorrect + " out of 5 on this quiz!");
	}
	public static String selectCategory(String select) {
		if(select.equals("M")) {
			return "You selected Math";
		} else if (select.equals("H")) {
			return "You selected History";
		} else {
			return "Invalid Category.";
		}
		
	}
	public static void showCategory(String select) {
		if(select.equals("M")) {
			displayMathQuestions();
		} else if (select.equals("H")) {
			displayHistoryQuestions();
		} else {
		}
	}
	public static void main(String[] args) {
		String directions = "Select a category below.\nEach Category has five questions, and your score will be displayed at the end.";
		System.out.println(directions);
		System.out.println("Math\tHistory\nEnter M for math or H for history.");
		Scanner categoryInput = new Scanner(System.in);
		String category = categoryInput.nextLine().toUpperCase();
		selectCategory(category);
		System.out.println(selectCategory(category));
		showCategory(category);
		categoryInput.close();
	}

}
