
import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter a number to check its factorial: ");
     int number=scanner.nextInt();
     int hello=factorials(number);
     System.out.println(hello);
     scanner.close();
    }
    public static int factorials(int num)
    {
        if (num==1)
        {
            return 1;
        }
        else
        {
            return num* factorials(num-1);
        }
        
    }
}