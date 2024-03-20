import java.util.Scanner;
public class arraysmallest {
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size=scanner.nextInt();
      int [] arr=new int[size];
      for (int i =0;i<size;i++)
      {
       System.out.println("Enter the "+i+"th element of the array: ");
       int value=scanner.nextInt();
       arr[i]=value;
      }
      int smallest=arr[0];
      for (int i=0;i<size;i++)
      {
        if (arr[i]<smallest)
        {
            smallest=arr[i];
        }
      }
      System.out.println("Smallest in the array: "+smallest);
      scanner.close();
    }
}