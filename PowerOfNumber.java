import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber :");
        double base = sc.nextDouble();
        System.out.println("ENter value of Power : ");
        double power = sc.nextDouble();
        double answer = Math.pow(base, power);
        System.out.println("Power of a number :" + answer);
        sc.close();
    }
    
}
