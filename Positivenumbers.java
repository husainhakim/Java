import java.util.Scanner;
public class Positivenumbers {
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n=scanner.nextInt();
      System.out.println("Numbers upto: "+n);
      int sum=0;
      for (int i=1;i<=n;i++)
      {
        System.out.println(i);
        sum=sum+i;
      }
      System.out.println("Sum: "+sum);
      scanner.close();
    }
    
}


