//Revmove the duplicat in array and print new array
public class RemoveTheDuplicatInArray {
    public static void main(String[] args) {
        //int[] a=new int[5];
        int a[]={10,20,20,30,40,40};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && a[j]!=0 && a[j]!=0){
                    a[j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        int[] b=new int[a.length-count];
        int j1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[j1++]=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
        System.out.println(" ");
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
        
    }
}
