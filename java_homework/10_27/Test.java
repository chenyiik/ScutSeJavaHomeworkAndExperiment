import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyStringBuilder1 str1 = new MyStringBuilder1(input.next());
		MyStringBuilder1 str2 = new MyStringBuilder1(input.next());
		System.out.println(str1.append(str2).toString());
	}
}
