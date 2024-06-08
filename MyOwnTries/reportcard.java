import java.util.Scanner;
public class reportcard{
    public static void main(String[] args) {
        System.out.println("Hey! Enter your name: ");
        Scanner sc = new Scanner (System.in);
        String username = sc.nextLine();
        System.out.println("Cool! Now enter your marks in Mathematics: ");
        int maths = sc.nextInt();
        System.out.println("Bravo! Enter your marks in English: ");
        int eng = sc.nextInt();
        System.out.println(username+"'s marks in Mathematics are " + maths + " and marks in English are " + eng + ".");
        sc.close();

    }
}