import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Course a = new Course("Java");
		a.addStudent("abc");
		a.addStudent("def");
		a.addStudent("ghi");
		Course b = (Course)a.clone();
		System.out.println(b.getCourseName());
		String[] s = b.getStudents();
		for (int i = 0; i < b.getNumberOfStudents(); i++) {
			System.out.println(s[i]);
		}
	}
}
