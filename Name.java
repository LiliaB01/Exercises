import java.util.Scanner;
public class Name {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "What is your name? ";
        String str2 = "Where do you live ";
        System.out.println(str1);
        String name = sc.next();
        System.out.println(str2 + "," + name + "?");
        String place = sc.next();
        System.out.println("Your name is " + name + ", you live in " + place + ".");
    }
}