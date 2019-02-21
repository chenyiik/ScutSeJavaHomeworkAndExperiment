import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedInputStream	input = new BufferedInputStream(new FileInputStream(args[0]));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[1]));
		int t = 0;
		while ((t = input.read()) != -1) {
			t -= 5;
			output.write((byte)t);
		}
		input.close();
		output.close();
	}
}
