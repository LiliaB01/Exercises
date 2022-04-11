import java.util.Scanner;

public class Telephone {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Standard units per minute for the first call");
        float c1 = sc.nextFloat();
        System.out.println("Standard units per minute for the second call");
        float c2 = sc.nextFloat();
        System.out.println("Standard units per minute for the third call");
        float c3 = sc.nextFloat();
        System.out.println("First call continued");
        float t1 = sc.nextFloat();
        System.out.println("Second call continued");
        float t2 = sc.nextFloat();
        System.out.println("Third call");
        float t3 = sc.nextFloat();
        float sum1 = c1*t1;
        float sum2 = c2*t2;
        float sum3 = c3*t3;
        float all_sum = sum1+sum2+sum3;
        System.out.println(" Count for each call separately : " + "first = " + sum1 + " second = " + sum2 + " third = " + sum3 );
        System.out.println( "Count for each call together = " + all_sum);

    }
}
