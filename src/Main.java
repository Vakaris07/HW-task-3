//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int evenCount = 0;
        int oddCount = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else oddCount++;

        }
        System.out.println("Number of even: " + evenCount);
        System.out.println("Number of odd: " + oddCount);



    }
}