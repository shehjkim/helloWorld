package condition;

public class conditionExample {

	public static void main(String[] args) {
		int score = 60;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}

		} else {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다");

	}
}
//else if와 if의 차이점
//if는 조건값이 구분을 만족하면 다 실행되어버림
//else if에서는 모두 만족하더라도 젤 위에 else if가 맞으면 밑에꺼는 실행하지 않음 (중요)