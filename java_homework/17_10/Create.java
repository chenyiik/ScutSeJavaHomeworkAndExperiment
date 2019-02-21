import java.io.*;

public class Create {
	public static void main(String[] args) throws IOException {
		DataOutputStream output = new DataOutputStream(new FileOutputStream("test_data.dat"));
		for (int i = 0; i < 10000; i++) {
			output.writeInt(i);
			output.writeChar(' ');
			output.writeDouble(Math.random());
			output.writeChar('\n');
		}
		output.close();
	}
}
