import java.util.*;
public class ArrayPractice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,401,90};
        swap(arr,1 ,4);
        swap(arr,1 ,4);
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum:"+max(arr));
        System.out.println("Maximum inRange:"+maxInRange(arr,0,2));
    }
    static void swap(int[] array,int index1,int index2 ){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
    static int max(int[] a){
        if(a.length==0)
            return -1;
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    
    static int maxInRange(int a[],int start,int end){
        if(a==null){
            return -1;
        }
        if(start>end){
            return -1;
        }
        int max=a[start];
        for(int i=start;i<=end;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
