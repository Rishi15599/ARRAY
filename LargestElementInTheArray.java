//W a p to print the largest elements in the array
// Problem no. 10
public class LargestElementInTheArray {
    public static void main(String[] args) {
        int a[]={19,2,37,4,50,6};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
