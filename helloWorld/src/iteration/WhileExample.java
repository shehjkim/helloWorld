package iteration;

public class WhileExample {

	public static void main(String[] args) {
	  //for(int i=0; i<10; i++) {}													//for 구문
		int i = 0;                                                                  //초기화식
		while(i < 10) {			                                                    //while(조건식)
			System.out.println("2 * " + i + " = " + (2 * i));
		    i++; 			                                                        //증감식
		}

	}

}
