import java.util.Scanner;

public class BinaryOperations2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("실수를 두 개 입력하시오: ");
		
		double i = input.nextDouble();
		double j = input.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", i, j, (i+j));
		System.out.printf("%.2f - %.2f = %.2f\n", i, j, (i-j));
		System.out.printf("%.2f * %.2f = %.2f\n", i, j, (i*j));
		System.out.printf("%.2f / %.2f = %.2f\n", i, j, (i/j));
	
		input.close();
	}
}