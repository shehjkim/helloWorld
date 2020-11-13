package helloWorld;

public class Variable {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 10;

		int sum = num1 + num2;
		int diff = num2 - num1;

		boolean trueoffalse = sum > diff;
		System.out.println(trueoffalse);

		if (trueoffalse) {
			System.out.println("결과 참입니다");
		} else {
			System.out.println("결과 거짓입니다");
		}
	}

}
