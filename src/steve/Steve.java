package steve;
import java.util.Scanner;


public class Steve 
{

    
    public static void main(String[] args) 
    {
            Scanner input = new Scanner (System.in);
            System.out.println("enter a number");
            int num = input.nextInt();
            
         
            if(num % 2 == 0)
            {
                    System.out.println("your number," + num + " is even");
            }
            else
            {
                    System.out.println("your number," + num + " is odd");
            }
    }
    
        
}