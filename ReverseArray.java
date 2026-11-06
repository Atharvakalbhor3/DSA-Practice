import java.util.*;
public class ReverseArray{
    public static void main(String[] args){
        int[] arr={1,2,31,43,5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int[] a){
        if(a==null){
            System.out.println("Null array");
        }
        if(a.length==0){
            System.out.println("Empty array");
        }
        int start=0;
        int end=a.length-1;
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
        
    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
    }
}
