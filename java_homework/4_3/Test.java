import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double ax = input.nextDouble();
		ax = Math.toRadians(ax);
		double ay = input.nextDouble();
		ay = Math.toRadians(ay);
		double bx = input.nextDouble();
		bx = Math.toRadians(bx);
		double by = input.nextDouble();
		by = Math.toRadians(by);
		double cx = input.nextDouble();
		cx = Math.toRadians(cx);
		double cy = input.nextDouble();
		cy = Math.toRadians(cy);
		double dx = input.nextDouble();
		dx = Math.toRadians(dx);
		double dy = input.nextDouble();
		dy = Math.toRadians(dy);
		final double r = 6371.01;
		double ab = r * Math.acos(Math.sin(ax) * Math.sin(bx) + Math.cos(ax) * Math.cos(bx) * Math.cos(ay - by));
		double bc = r * Math.acos(Math.sin(bx) * Math.sin(cx) + Math.cos(bx) * Math.cos(cx) * Math.cos(by - cy));
		double cd = r * Math.acos(Math.sin(cx) * Math.sin(dx) + Math.cos(cx) * Math.cos(dx) * Math.cos(cy - dy));
		double da = r * Math.acos(Math.sin(dx) * Math.sin(ax) + Math.cos(dx) * Math.cos(ax) * Math.cos(dy - ay));
		double ac = r * Math.acos(Math.sin(ax) * Math.sin(cx) + Math.cos(ax) * Math.cos(cx) * Math.cos(ay - cy));
		double s1 = (ab + bc + ac) / 2;
		double area1 = Math.sqrt(s1 * (s1 - ab) * (s1 - bc) * (s1 - ac));
		double s2 = (cd + da + ac) / 2;
		double area2 = Math.sqrt(s2 * (s2 - cd) * (s2 - da) * (s2 - ac));
		System.out.println(area1 + area2);
	}
}
