import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("your roll number is " + number);
    }
}
