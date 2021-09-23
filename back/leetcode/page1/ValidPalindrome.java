package page1;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String remove = s.replaceAll("[^A-Za-z0-9]", "");
        remove = remove.toUpperCase();

        for (int i = 0; i < remove.length() / 2; i++) {
            if (remove.charAt(i) != remove.charAt(remove.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }
}
