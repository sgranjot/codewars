package writeNumberInExpandedForm;

public class Kata {

	public static String expandedForm(int num) {

		StringBuilder sb = new StringBuilder("");

		String[] nums = String.valueOf(num).split("");

		for (int i = 0; i < nums.length; i++) {
			if (!nums[i].equals("0")) {
				sb.append(nums[i]);
				for (int j = 0; j < String.valueOf(num).length() - (i + 1); j++) {
					sb.append("0");
				}
				sb.append(" + ");
			}
		}

		if (sb.charAt(sb.length() - 1) == ' ') {
			sb.deleteCharAt(sb.length() - 1);
			sb.replace(sb.length() - 2, sb.length(), "");
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		Kata k = new Kata();

		System.out.println(k.expandedForm(205601));

	}

}
