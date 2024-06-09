import java.util.*;

public class checkPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (palindrome(a)){
//            System.out.println(a + " is a palindrome number.");
//        }
//        else
//            System.out.println((a + " is not a palindrome number."));
        for (int i = 0; i < 1000; i++) {
            if(palindrome(i)==true){
                System.out.println(i);
            }
        }


    }
    static boolean palindrome(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int rem = num%10;
            int cube = rem * rem * rem;
            sum += cube;
            num /= 10;
        }
        if (sum != original) {
            return false;
        }
        return true;
    }
}

