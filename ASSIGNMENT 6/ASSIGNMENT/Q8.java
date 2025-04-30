package ASSIGNMENT;

public class Q8 {
	public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String test = " Level ";
        if (isPalindrome(test)) {
            System.out.println("\"" + test + "\" is a palindrome.");
        } else {
            System.out.println("\"" + test + "\" is not a palindrome.");
        }
    }
}
	
		    