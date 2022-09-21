//W a p to sort the elements of an array in the ascending order
//problem no. 8
import java.util.Scanner;
public class SortTheElementOfArrayAscendingOrder_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        //a=ascending(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //System.out.println();
        a=ascending(a);
        System.out.println(" ");
        System.out.println("Array after sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }

    }
    public static int[] ascending(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
}