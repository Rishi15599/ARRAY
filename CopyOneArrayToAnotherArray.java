//W a p to copy the elements of one array into another array
// problem no. 5
import java.util.Scanner;
public class CopyOneArrayToAnotherArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        System.out.println("Enter the value for first array =");
        int[] a=new int[size];
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print
            (b[i]+" ");
        }
    }
}
