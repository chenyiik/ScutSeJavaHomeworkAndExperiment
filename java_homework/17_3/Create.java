import java.io.*;

public class Create {
	public static void main(String[] args) throws IOException { 
		DataOutputStream output= new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));
		int ans = 0;
		for (int i = 0; i < 100; i++) {
			int x = (int)(Math.random() * 1000);
			output.writeInt((int)x);
			ans += x;
		}
		System.out.println(ans);
		output.close();
	}
}
