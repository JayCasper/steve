package steve;
//Edited by Kyle Manley 02/07/2018
import java.util.Scanner;

public class Steve 
{
    public static void main(String[] args) 
    {
         Scanner input = new Scanner (System.in);
         boolean even;
         System.out.println("enter a number");
         int num = input.nextInt();
         if(num % 2 == 0)
         {
            even = true;
         }
         else
         {
            even = false;
         }
         System.out.print("Your number " + num + " is ");
         if(even)
         {
            System.out.println("even");
         }
         if(!even)
         {
            System.out.println("odd");
         }
    }   
}