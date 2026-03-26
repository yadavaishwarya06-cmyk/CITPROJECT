import java.util.Scanner;

//public class ControlStructres {
public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the age");
    // int age = sc.nextInt();
    // if(age>=18)
    // System.out.println("Eligible for voting");
    // sc.close();
    // if-else - biggest of two number
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the frist number");
    int a = sc.nextInt();
    System.out.println("Enetr the second number");
    int b = sc.nextInt();
    if (a > b)
        System.out.println("frist number is larger");
    else
        System.out.println("second number is biggest");
}
