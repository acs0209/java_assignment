public class Summation {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int j = 1;
		
		for (int i = 1; i < 101; i++) {
			num1 += i;	
		}
		while (j < 101) {
			num2 += j;
			j += 1;
		}
	
		System.out.println("for 이용: 1부터 100까지의 자연수의 합 = " + num1);
		System.out.println("while 이용: 1부터 100까지의 자연수의 합 = " + num2);
	}
}