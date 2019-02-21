import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyStingBuilder2 str = new MyStingBuilder2("helloworld");
		str.reverse().insert(5, new MyStingBuilder2("my"));
		System.out.println(str.substring(3).toUpperCase());
	}
}
