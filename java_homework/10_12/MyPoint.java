public class MyPoint {
	private double x = 0;
	private double y = 0;

	public MyPoint() {}

	public MyPoint(MyPoint p) {
		x = p.x;
		y = p.y;
	}

	public MyPoint(double X, double Y) {
		x = X;
		y = Y;
	}

	public MyPoint(MyPoint a, MyPoint b) {
		x = b.x - a.x;
		y = b.y - a.y;
	}

	public double getX() { return x; }
	public double getY() { return y; }

	public double distance(MyPoint p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	public double distance(double X, double Y) {
		return distance(new MyPoint(X, Y));
	}

	public static double distance(MyPoint a, MyPoint b) {
		return a.distance(b);
	}
}
