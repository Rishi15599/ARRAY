//W a p to print the elements of an array present in odd position
// Problem no. 8
import java.util.Scanner;
public class ElementOfArrayPresentInOddPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            System.out.print(a[i]+" ");
            //System.out.println();
        }
        for(int i=0;i<a.length;i=i+2){
            System.out.print(a[i]+" ");
        }
    }
}
