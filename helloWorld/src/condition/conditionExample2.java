package condition;

public class conditionExample2 {

	public static void main(String[] args) {
		int score = 90;
		score /= 10;
		String grade = "";

		switch(score) {
		case 9 :
		case 8 :
			grade = "양호";
			break;
		case 7 :
        case 6 :
			grade = "보통";
			break;
		default :
			grade = "미흡";			
		}
		System.out.println(score+"은"+grade+"입니다");			
	}
}

//break는 else if와 같음 . 조건 만족하면 밑에거는 실행안한다는 뜻

 