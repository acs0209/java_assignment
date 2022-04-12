import java.util.Scanner;

public class LargerNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 두 개 입력하시오: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.print("더 큰 수는 " + num1 + "입니다.");
		} else if (num1 < num2) {
			System.out.print("더 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.print("두 수는 같습니다.");
		}
	
		input.close();
	}
}