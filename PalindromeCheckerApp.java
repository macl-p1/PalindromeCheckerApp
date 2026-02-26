import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();

        int r = c.length - 1;
        boolean not = false;

        for (int l = 0 ; l < c.length ; l++){
            if (c[r] != c[l]) not = true;
            else r--;
        }

        if (!not) System.out.println("It is a Palindrome");
        else System.out.println("It is not a Palindrome");
    }
}
