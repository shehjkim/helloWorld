package iteration;

public class ForMyExample {
    public static void main(String[] args) {
    	int sum = 1;
     	for(int i=0; i <= 10; i++) {
     		if (i % 2 ==0) {
     			sum +=i;
     		}
        	System.out.println("sum: "+sum);
     	}
    }
}