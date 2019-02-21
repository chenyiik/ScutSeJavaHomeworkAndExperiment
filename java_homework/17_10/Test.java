import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		long len = file.length();
		int block = Integer.parseInt(args[1]);
		long size = len / block;
		if (len % block != 0)
			size++;
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(args[0]));
		for (int i = 1; i <= block; i++) {
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[0] + '.' + i));
			for (int j = 0; j < size; j++) {
				int t = input.read();
				if (t == -1)
					break;
				output.write((byte)t);
			}
			output.close();
		}
		input.close();
	}
}
