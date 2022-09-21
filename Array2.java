//Two arrays in the one array !
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array : ");
       int size=sc.nextInt();
       int[] a=new int[size];
       int[] b=new int[size]; 

       int[] c=new int[a.length+b.length];

       for(int i=0;i<a.length;i++){
        System.out.println("Enter the value of array[a]"+i);
        a[i]=sc.nextInt();
        System.out.println("Enter the value of array[b]"+i);
        b[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
        c[i]=a[i];
       }
       int j=0;
       for(int i=a.length;i<c.length;i++){
        c[i]=b[j++];
       }
       for(int i=0;i<c.length;i++){
        System.out.print(c[i]+" ");
       }
    }
}
