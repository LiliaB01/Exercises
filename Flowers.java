import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the radius of the circle ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The perimeter equals = " + perimeter);
        System.out.println("The area equals = " + area);
    }
}
