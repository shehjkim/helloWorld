package iteration;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance =2;
		Scanner scanner = new Scanner(System.in);
	
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			int menu=scn.nextInt();
			if(menu == 1) {
				System.out.println("예금액 >");
			}else if (menu==2) {
				System.out.println("총금액 >");
			}else if (menu==3) {
				System.out.println("잔고 >" + balance);
			}else if (menu==4) {
				run = false;
			}
			
		} // end of while
		System.out.println("프로그램 종료.");
		
}//end of main()
}
