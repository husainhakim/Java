import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int number=scanner.nextInt();
    int [] arr=new int[number];

    
    for (int i=0;i<number;i++)
    {
        System.out.println("Enter the "+i+"th element of the array: ");
        arr[i]=scanner.nextInt();
    }
    int sum=0;
    for (int i=0;i<number;i++)
    {
        System.out.println(i);
        sum+=i;
    }
    System.out.println("Sum of all elements in the array: "+sum );
    scanner.close();
    }
}
