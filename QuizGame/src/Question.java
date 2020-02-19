
public class Question {
	private int questionNum;
	private String question;
	private String ansA;
	private String ansB;
	private String ansC;
	private String ansD;
	private String ansCorrect;
	
	public Question(int qNum, String q, String a, String b, String c, String d, String correct) {
		questionNum = qNum;
		question = q;
		ansA = a;
		ansB = b;
		ansC = c;
		ansD = d;
		ansCorrect = correct;
	}
	public int getNum() {
		return questionNum;
	}
	public String getQuestion() {
		return question;
	}
	public String getA() {
		return ansA;
	}
	public String getB() {
		return ansB;
	}
	public String getC() {
		return ansC;
	}
	public String getD() {
		return ansD;
	}
	public String getCorrect() {
		return ansCorrect;
	}
}
