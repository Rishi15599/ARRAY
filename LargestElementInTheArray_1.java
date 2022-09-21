//W a p to print the largest elements in the array
// Problem no. 10
import java.util.Scanner;
public class LargestElementInTheArray_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Max value = "+maxElement(a));
    }

    public static int maxElement(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
