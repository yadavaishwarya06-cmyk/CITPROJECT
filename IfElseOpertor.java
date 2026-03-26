import java.util.Scanner;

public class IfElseOpertor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int units;
         double bill;
         System.out.println("Enetr the untis from user");
         units = sc.nextInt();
         if (units<=150)
            bill=units*1.5;
         else
            bill=units*3;
         System.out.println("Final electricity Bill="+bill);
         sc.close();

    }
    
}
