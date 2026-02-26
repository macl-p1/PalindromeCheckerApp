public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        String str = "ABA";
        char[] s = str.toCharArray();
        boolean not = false;
        for (int i = 0 ; i < str.length() / 2 ; i++){
            if (s[i] != s[str.length() - i - 1]){
                not = true;
                break;
            }
        }

        if (!not) System.out.println("It is a Palindrome");
        else System.out.println("It is not a Palindrome");

    }
}
