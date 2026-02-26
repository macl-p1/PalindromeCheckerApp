import java.util.*;
public class UseCase5PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            stack.push(c);
        }

        boolean not = false;

        for (char c : s.toCharArray()){
            if (stack.peek() == c) stack.pop();
            else not = true;
        }

        if (not) System.out.println("It is not a palindrome");
        else System.out.println("It is a palindrome");
    }
}
