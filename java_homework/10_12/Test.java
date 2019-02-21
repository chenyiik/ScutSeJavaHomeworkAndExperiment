import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("It area is " + t1.getArea());
		System.out.println("It preimeter is " + t1.getPerimeter());
		System.out.println(t1.contains(new MyPoint(3, 3)) ? "In" : "Not in");
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))) ? "In" : "Not in");
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))) ? "Over" : "Not over");
	}
}
