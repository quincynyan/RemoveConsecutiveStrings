import java.util.*;

public class RemoveRepeatedCharacters {
	public static void main(String[] args) {
		System.out.println(removeRepeatedCharacters("heeeeelllooo"));
	}

	public static String removeRepeatedCharacters(String str) {
		String res = "";
		Set<Character> chars = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!chars.contains(str.charAt(i))) {
				res += str.charAt(i);
				chars.add(str.charAt(i));
			}
		}
		return res;
	}
}
