import java.util.*;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = s;
        boolean not = false;
        for (int i = x.length() - 1 ; i >= 0 ; i--){
            if (s.charAt(i) != x.charAt(x.length() - i - 1)) not = true;
        }

        if (!not) System.out.println("It is a Palindrome");
        else System.out.println("It is not a Palindrome");
    }
}
