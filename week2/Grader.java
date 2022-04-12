import java.util.Scanner;

public class Grader {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int gradeNumer = input.nextInt();
		
		if (gradeNumer >= 90) {
			System.out.print("등급 = A");
		} else if (gradeNumer >= 80) {
			System.out.print("등급 = B");
		} else if (gradeNumer >= 70) {
			System.out.print("등급 = C");
		} else if (gradeNumer >= 60) {
			System.out.print("등급 = D");
		} else if (gradeNumer < 60) {
			System.out.print("등급 = F");
		}
		
		input.close();
	}
}