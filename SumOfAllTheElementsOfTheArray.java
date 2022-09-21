//W a p to print the sum of all the elements of the array
//Problem no. 2
import java.util.Scanner;
public class SumOfAllTheElementsOfTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int size=sc.nextInt();
        System.out.println("Enter the value");
        int[] a=new int[size];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of all the elements = "+sum);
    }
}
