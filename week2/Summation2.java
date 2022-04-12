import java.util.Scanner;

public class Summation2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1부터 얼마까지의 자연수를 더하시겠습니까? ");
		
		int num = input.nextInt();
		int j = 1;
		int numInput1 = 0;
		int numInput2 = 0;
		
		for (int i = 1; i <= num; i++) {
			numInput1 += i;	
		}
		while (j <= num) {
			numInput2 += j;
			j += 1;
		}
	
		System.out.println("for 이용: 1부터 " + num + "까지의 자연수의 합 = " + numInput1);
		System.out.println("while 이용: 1부터 " + num + "까지의 자연수의 합 = " + numInput2);
		
		input.close();
	}
}