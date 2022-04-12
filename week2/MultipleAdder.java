import java.util.Scanner;

public class MultipleAdder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 몇 개 더하시겠습니까? ");
		int count = input.nextInt();
		
		int totalNum = 0;
		
		System.out.print(count + "개의 정수를 차례로 입력하시오: ");
		for (int i = 0; i < count; i++) {
			int num = input.nextInt();
			totalNum += num;
		}
		
		System.out.print("정수의 합 = " + totalNum);
		
		input.close();
	}
}