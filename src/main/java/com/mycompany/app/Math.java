
public class Arithmetic_Operators
{
   public static void main(String args[])
   {   
       
        while(true)
        {
            System.out.println("");
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = 20;
            System.out.print("Enter the second number : ");
            int y = 30;
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
           for(int i=1;i<7;i++)
           {
               
            switch(i)
            {
                case 1:
                int add;
                add = x + y;
                System.out.println("Addition of Two Numbers : "+add);
                break;
 
                case 2:
                int sub;
                sub = x - y;
                System.out.println("Subtraction of Two Numbers : "+sub);
                break;
 
                case 3:
                int mul;
                mul = x * y;
                System.out.println("Multiplication of Two Numbers  : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) x / y;
                System.out.print("Division of Two Numbers  : "+div);
                break;
 
                case 5:
                int mod;               
                mod = x % y;
                System.out.println("Modulus of Two Numbers  : "+mod);
                break;
 
                case 6:
                System.out.println("Nothing");
            }
        }
    }
   }
}
