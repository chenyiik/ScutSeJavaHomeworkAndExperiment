public class IllegalTriangleException extends Exception {
	private String str;

	public IllegalTriangleException(String message) {
		str = new String(message);
	}

	public String getMessage() {
		return str;
	}
}
