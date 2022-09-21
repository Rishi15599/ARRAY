//W a p to sort the elements of an array in the ascending order
//problem no. 8
import java.util.Scanner;
public class SortTheElementOfArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }System.out.println(a[i]+" ");
    }
}
