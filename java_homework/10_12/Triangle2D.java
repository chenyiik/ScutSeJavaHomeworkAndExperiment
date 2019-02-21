public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	public Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}

	public Triangle2D(MyPoint P1, MyPoint P2, MyPoint P3) {
		p1 = P1;
		p2 = P2;
		p3 = P3;
	}

	public MyPoint getPoint1() { return p1; }
	public MyPoint getPoint2() { return p2; }
	public MyPoint getPoint3() { return p3; }
	public void setPoint1(MyPoint p) { p1 = p; }
	public void setPoint2(MyPoint p) { p2 = p; }
	public void setPoint3(MyPoint p) { p3 = p; }

	public double getArea() {
		double l1 = getLine1(), l2 = getLine2(), l3 = getLine3(), p = (l1 + l2 + l3) / 2;
		return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
	}

	public double getPerimeter() {
		return getLine1() + getLine2() + getLine3();
	}

	public boolean contains(MyPoint p) {
		MyPoint r1 = new MyPoint(p, p1), r2 = new MyPoint(p, p2), r3 = new MyPoint(p, p3);
		double angle1 = Math.asin(getCross(r1, r2) / (r1.distance(0, 0) * r2.distance(0, 0))),
			   angle2 = Math.asin(getCross(r2, r3) / (r2.distance(0, 0) * r3.distance(0, 0))),
			   angle3 = Math.asin(getCross(r3, r1) / (r3.distance(0, 0) * r1.distance(0, 0))),
			   sum_angle = angle1 + angle2 + angle3;
		if (sum_angle < 0)
			sum_angle = -sum_angle;
		return sum_angle > Math.PI * 2 - 1e-9;
	}

	public boolean contains(Triangle2D t) {
		return contains(t.getPoint1()) && contains(t.getPoint2()) && contains(t.getPoint3());
	}

	public boolean overlaps(Triangle2D t) {
		boolean[] b = {
			isXiangJiao(p1, p2, t.getPoint1(), t.getPoint2()),
			isXiangJiao(p1, p2, t.getPoint2(), t.getPoint3()),
			isXiangJiao(p1, p2, t.getPoint3(), t.getPoint1()),
			isXiangJiao(p2, p3, t.getPoint1(), t.getPoint2()),
			isXiangJiao(p2, p3, t.getPoint2(), t.getPoint3()),
			isXiangJiao(p2, p3, t.getPoint3(), t.getPoint1()),
			isXiangJiao(p3, p1, t.getPoint1(), t.getPoint2()),
			isXiangJiao(p3, p1, t.getPoint2(), t.getPoint3()),
			isXiangJiao(p3, p1, t.getPoint3(), t.getPoint1()),
		};
		for (boolean i : b) {
			if (i)
				return true;
		}
		return false;
	}

	private double getLine1() { return p1.distance(p2); }
	private double getLine2() { return p2.distance(p3); }
	private double getLine3() { return p3.distance(p1); }
	private double getCross(MyPoint a, MyPoint b) { return a.getX() * b.getY() - a.getY() * b.getX(); }
	private boolean isXiangJiao(MyPoint a1, MyPoint a2, MyPoint b1, MyPoint b2) {
		double a_b1 = getCross(new MyPoint(a1, a2), new MyPoint(a1, b1)), 
			   a_b2 = getCross(new MyPoint(a1, a2), new MyPoint(a1, b2)),
			   b_a1 = getCross(new MyPoint(b1, b2), new MyPoint(b1, a1)), 
			   b_a2 = getCross(new MyPoint(b1, b2), new MyPoint(b1, a2));
		return a_b1 * a_b2 < 0 && b_a1 * b_a2 < 0;
	}
}
