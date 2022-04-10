import java.util.*;

public class Program{

    // program to remove even numbers
    int[] removeEven(int[] arr){
        int count =0;
        int[] arr1=new int[arr.length];
        List<Integer> list = new ArrayList<>();

        for (int i =0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                arr1[i]= arr[i];
                count++;
            }
        }

        for (int i =0; i<arr1.length; i++){
            if(arr1[i] != 0){
                list.add(arr1[i]);
            }
        }

        Object[] a = list.toArray();
        int[] a1=new int[a.length];
        for (int i =0; i<a.length; i++){
           a1[i]= (int) a[i];
        }

        return a1;
    }

    // program to get array elements whose sum is equal to target
    public  int[] findSum(int[] arr, int target){
        int[] arr1=new int[2];

        for (int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    arr1[1]=arr[j];
                    arr1[0]=arr[i];

                }
            }
        }
      return arr1;

    }

    public static void main(String[] args) {
        Program program = new Program();
       List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int []  arr1 = {1,3,5,6,7,8};
        int[] arr2 = program.removeEven(arr);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = program.findSum(arr1,13);
        System.out.println(Arrays.toString(arr3));


    }
}