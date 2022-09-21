//W a p to print the smallest elements in the array
//problem no. 11
import java.util.Scanner;
public class SmallestElementInTheArray_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Min value = "+maxElement(a));
    }

    public static int maxElement(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
