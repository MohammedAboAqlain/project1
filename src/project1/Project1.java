
package project1;
import java.util.Scanner;
public class Project1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] allNumbers = new int[201];
        System.out.println("Enter a number between -100 to 100, zero ends the program : ");
        int i = input.nextInt();
        
        
        while(i != 0 && isValidInput(i)){
            
            allNumbers[i + 100]++;
            i = input.nextInt();
        }
        
        for (i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] != 0)
                System.out.println((i-100) + " repeated " + allNumbers[i] + " times");
            
        }
        
        
        
    }
    
    public static boolean isValidInput(int n){
        if(n >= -100 && n <= 100){
            return true;
        }else
            System.out.println(n + " is invalid input, input should be between -100 and 100 ");
        System.exit(1);
        return false;
    }
    
}
