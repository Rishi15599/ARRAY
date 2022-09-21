//W a p to find the 3rd largest number in an array
//problem no .12
import java.util.Scanner;
public class Find3rdLargestNumberInArray {

    public static void largest3(int[] a)
    {
            //To remove duplicate
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[j]!=0)
  
                {
                    a[j]=0;
                }
            }
        }

        int count=0;
        //to count the no. time "0" occured the array
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            count++;
        }
        //New array of size(prev)
        int[] b=new int[a.length-count];
        int k=0;
        //Copy all the elements in new array
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0){
                b[k++]=a[i];
            }
        }
        //short the array in ascending order
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    int temp=b[j];
                    b[j]=b[i];
                    b[i]=temp;
                }
            }
        }
        if(b.length<=2){
            System.out.println("there is no third largest");
        }else{
            System.out.println(b[b.length-3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size  of Array : ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        largest3(a);

    }
}
