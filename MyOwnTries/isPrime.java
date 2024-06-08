import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (prime(n)){
            System.out.println(n + " is a prime number.");
        }
        else
            System.out.println(n + " is not a prime number");
    }

    public static boolean prime(int num){
        if (num<=1){
            return false;
        }
        else if (num==2){
            return true;
        }
        else if (num%2==0){
            return false;
        }
        int sq = (int)Math.sqrt(num);
        for (int i = 3; i <=sq ; i+=2) {
            if (num%i == 0){
                return false;
            }
//            else
//                return true;
        }
        return true;
    }
}


/*Explanation
Base Cases:

If the number is less than or equal to 1, it is not prime.
If the number is 2, it is prime (since 2 is the smallest prime number).
If the number is even and greater than 2, it is not prime.
Loop from 3 to Square Root of the Number:

We start the loop from 3 and increment by 2 (to skip even numbers) up to the square root of the number.
For each iteration, check if the number is divisible by i.
If it is divisible, the number is not prime.
If no divisors are found up to the square root, the number is prime.
Example Run
For number = 29:

It is greater than 1.
It is not even and not equal to 2.
Loop checks divisors from 3 to 5 (since sqrt(29) ≈ 5.39):
29 % 3 != 0
29 % 5 != 0
No divisors found, so 29 is prime.
This method ensures efficient checking with minimal iterations, making it suitable for relatively large numbers.*/