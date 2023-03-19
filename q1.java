import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        
        int reversedNum = 0;
        int originalNum = num;
        while (originalNum != 0) {
            reversedNum = reversedNum * 10 + originalNum % 10;
            originalNum /= 10;
            
        if (num == reversedNum)
         {
            System.out.println(num + " is a palindrome number.");
        } else 
        {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
}

