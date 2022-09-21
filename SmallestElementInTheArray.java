//W a p to print the smallest elements in the array
//problem no. 11
public class SmallestElementInTheArray {
    public static void main(String[] args) {
        int a[]={223,234,657,987};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }System.out.println(min);
    }
}
