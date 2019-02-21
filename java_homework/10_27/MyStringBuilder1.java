public class MyStringBuilder1 {
	private String str;

	public MyStringBuilder1(String s) { str = new String(s); }

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		str = str + s.str;
		return this;
	}

	public MyStringBuilder1 append(int i) {
		str = str + i;
		return this;
	}

	public int length() { return str.length(); }
	public char charAt(int index) { return str.charAt(index); }

	public MyStringBuilder1 toLowerCase() {
		MyStringBuilder1 lstr = new MyStringBuilder1(str.toLowerCase());
		return lstr;
	}

	public MyStringBuilder1 substring(int begin, int end) {
		MyStringBuilder1 sstr = new MyStringBuilder1(str.substring(begin, end));
		return sstr;
	}

	public String toString() { return str; }
}
