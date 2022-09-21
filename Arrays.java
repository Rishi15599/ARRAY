import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the length");
       int size=sc.nextInt();
       System.out.println("Enter the element of arrays");
       int[] a=new int[size];
       for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++){
        System.out.println(a[i]+" ");
       }

    }
}