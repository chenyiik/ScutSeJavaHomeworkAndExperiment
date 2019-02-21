import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));
		int ans = 0;
		for (int i = 0; i < 100; i++) {
			ans += input.readInt();
		}
		System.out.println(ans);
		input.close();
	}
}
