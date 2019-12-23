import java.util.Scanner;
public class Sum_Average
{
    public static void main(String[] args) 
    {
        int n, s = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            s = s + a[i];
        }
        System.out.println("S:"+);
        average = (float)sum / n;
        System.out.println("Avg:"+avg);
    }
}