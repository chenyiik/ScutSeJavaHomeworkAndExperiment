public class MyStingBuilder2 {
	private String str;

	public MyStingBuilder2() { str = new String(); }
	public MyStingBuilder2(char[] chars) { str = new String(chars); } 
	public MyStingBuilder2(String s) { str = new String(s); }

	public MyStingBuilder2 insert(int offset, MyStingBuilder2 s) {
		str = str.substring(0, offset) + s.str + str.substring(offset);
		return this;
	}

	public MyStingBuilder2 reverse() {
		char[] chs = new char[str.length()];
		for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--)
			chs[j] = str.charAt(i);
		str = new String(chs);
		return this;
	}

	public MyStingBuilder2 substring(int begin) {
		MyStingBuilder2 sstr = new MyStingBuilder2(str.substring(begin));
		return sstr;
	}

	public MyStingBuilder2 toUpperCase() {
		MyStingBuilder2 ustr = new MyStingBuilder2(str.toUpperCase());
		return ustr;
	}

	public String toString() {
		return str;
	}
}
