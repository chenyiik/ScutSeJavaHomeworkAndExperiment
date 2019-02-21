public class Triangle {
	private double side1, side2, side3;

	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		else
			throw new IllegalTriangleException("These 3 sides are illegal");
	}
}
