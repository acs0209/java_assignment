import java.util.Scanner;

public class StringAdder{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("단어를 두 개 입력하시오: ");
		
		String word1;
		String word2;
		
		word1 = input.next();
		word2 = input.next();
		
		System.out.println(word1 + word2);
		
		input.close();
	}
}