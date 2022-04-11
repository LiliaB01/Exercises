import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();
        System.out.print("Enter x = ");
        int x = sc.nextInt();
        System.out.print("Enter y = ");
        int y = sc.nextInt();
        if ((x >= a && y >= b) || (x >= b) && (y >= a)) {
            System.out.println("The task is done");
        }
        if ((x >= b) && (y >= c) || (x >= c) && (y >= b)) {
            System.out.println("The task is done");
        } else {
            System.out.println("The task is failed");
        }
    }
}