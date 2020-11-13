package condition;

public class conditionExample {

	public static void main(String[] args) {
		int score = 60;
		String grade = "";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다");

	}
}
//else if와 if의 차이점
//if는 조건값이 구분을 만족하면 다 실행되어버림
//else if에서는 모두 만족하더라도 젤 위에 else if가 맞으면 밑에꺼는 실행하지 않음 (중요)