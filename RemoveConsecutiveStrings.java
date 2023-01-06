class RemoveConsecutiveStrings {
	public static void main(String[] args) {
		System.out.println(removeConsecutiveStrings("heeeeelllooo"));
	}

	public static String removeConsecutiveStrings(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}