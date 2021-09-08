import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	public String longestPalindrome(String s) {
		int n = s.length();
		int max = 0;
		String str1 = "";
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <= n; j++) {
				String str = s.substring(i, j);
				System.out.println(str);
				if (judge(str) && str.length() > max) {
					max = str.length();
					str1 = str;
				}
			}
		}
		return str1;
	}

	public boolean judge(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Solution so = new Solution();
		System.out.println(so.longestPalindrome(s));
	}
}