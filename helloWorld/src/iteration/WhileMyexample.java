package iteration;

public class WhileMyexample {
	public static void main(String[] args) {
//1부터 10까지 합:

	int i=1,sum=0;
	while(true) {
		sum += i;
		i++;			
		if (i== 10) {
			break;
		}
	
	}
		System.out.println("1부터 10까지 합:" + sum);
 	
	}
	
	}

//i++ : 증감식 위치에 따라 값이 달라짐