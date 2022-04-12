import java.util.Scanner;

public class Adder 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 두 개 입력하시오: ");

		// 이 부분에 필요한 소스코드를 채워 전체 프로그램을 완성하세요.
		int i = input.nextInt();
		int j = input.nextInt();
		
		System.out.println(i + " + " + j + " = " + (i + j));
		
		input.close();

	}
}