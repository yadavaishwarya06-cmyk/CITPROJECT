import java.util.Scanner;

public class Nestedif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to vote and avali goverment fund");
            }
            else
            System.out.println("We are eligible to vote but not eligible to avali goverment fund");
        }
        else
        System.out.println("We are not eligible to vote and not eligible to avail goverment fund");
    }
    
}
