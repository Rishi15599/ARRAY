//W a p to print the elements of an array in reverse order
//Problem no. 4
import java.util.Scanner;
public class ElementOfArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enetr the value");
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
