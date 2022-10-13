package BasicPrograms;

public class charReplace {
	public static void main(String[] args) {
		String str = "PAVANI";

		String res = ceasarCipher(str);
		System.out.println(res);
	}

	public static String ceasarCipher(String str) {
		// TODO Auto-generated method stub
		String str1 = "";
		char ch1;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int c = (int) ch[i];
			if (c <= 85) {
				int j = (int) ch[i] + 5;
				ch1 = (char) j;
				str1 = str1 + ch1;
			}
			if (c > 85) {
				int k = (int) ch[i] - 20;
				ch1 = (char) k;
				str1 = str1 + ch1;
			}

		}
		return str1;

	}
}
