import java.util.*;
public class UseCase6PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){

        }

        boolean not = false;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                not = true;
                break;
            }
        }

        if (not) System.out.println("It is not a palindrome");
        else System.out.println("It is a palindrome");

    }
}
