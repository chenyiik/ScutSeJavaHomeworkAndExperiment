import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		int argc = args.length;
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[argc - 1]));
		for (int i = 0; i < argc - 1; i++) {
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(args[i]));
			int t = 0;
			while ((t = input.read()) != -1) {
				output.write((byte)t);
			}
			input.close();
		}
		output.close();
	}
}
