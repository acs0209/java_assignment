import java.util.Scanner;

public class Summation3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1부터 얼마까지의 짝수를 더하시겠습니까? ");
		int num = input.nextInt(); 
		
		int even1 = 0;
		int even2 = 0;
		
		for (int i = 2; i <= num; i += 2) {
			even1 += i;
		}
		for (int j = 1; j <= num; j++) {
			if (j % 2 == 0) {
				even2 += j;
			}
		}
		
		System.out.println("첫 방법: 1부터 " + num + "까지의 짝수의 합 = " + even1);
		System.out.println("두 번째 방법: 1부터 " + num + "까지의 짝수의 합 = " + even2);
	
		input.close();
	}
}