package condition;

public class conditionExample1 {

	public static void main(String[] args) {
		int score = 90;
		String grade = "";

		if (score >= 90) {
			grade = "A";
		}
		if (score >= 80) {
			grade = "B";
		}
		if (score >= 70) {
			grade = "C";
		}
		if (score >= 60) {
			grade = "D";
		}
		if (score < 60) {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다");

	}
}
