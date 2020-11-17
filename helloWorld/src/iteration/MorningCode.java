package iteration;

public class MorningCode {

	public static void main(String[] args) {
		int sum7 = 0;
		int sum8 = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0) {
				sum7 += i;

				System.out.println("7의 배수의 합은" + sum7 + "입니다");
			} else if (i % 8 == 0) {
				sum8 += i;
				System.out.println("8의 배수의 합은" + sum8 + "입니다");
			}
		}
	}
}
