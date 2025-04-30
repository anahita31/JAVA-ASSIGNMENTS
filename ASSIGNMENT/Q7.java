package ASSIGNMENT;

public class Q7 {
	public static int count(String str) {
        int vowelCount = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        String input = "Welcome";
        int result = count(input);
        System.out.println("Number of vowels in " + input +  " : " + result);
    }
}