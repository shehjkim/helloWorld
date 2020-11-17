package iteration;

public class ForMultiTable {

	public static void main(String[] args) {
		int num = 2;
		for (int i = 1; i <= 9; i++) { // for는 i에 대한, 1부터 9까지/ i++만큼 많아짐
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}

//for문은 i에 대한 범위 (i나 j를 많이씀)
//int i = ? -> 숫자 ?부터 시작
// i >= ?   -> i값의 범위 
//i++       -> i의 증감 (++, --가능)
//num1 = 2 * i -> i를 이용하여 확인하고싶은 연속값 (num1은 미지수라 변경해도됨)
