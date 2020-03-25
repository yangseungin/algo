package page9;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
	public static void main(String[] args) {
		System.out.println(numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" }));
	}

	public static int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();
		for (String email : emails) {
			int i = email.indexOf('@');
			String local = email.substring(0, i);
			String rest = email.substring(i);
			if (local.contains("+")) {
				local = local.substring(0, local.indexOf('+'));
			}

			local = local.replaceAll("\\.", "");
			set.add(local + rest);
		}

		return set.size();
	}

}
