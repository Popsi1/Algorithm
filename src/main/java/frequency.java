import java.util.ArrayList;
import java.util.List;

//Program to find the frequency of each element in the array

class frequency {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int[] a = {1,1,2,3,2,2,3,3,3,3};
        int count=1;
        for (int i=0; i<a.length; i++){
            if(!list1.contains(a[i])) {
                for (int j=i+1; j<a.length; j++){
                        if (a[i] == a[j]) {
                            count=count+1;
                            list.add(count);
                            if (!list1.contains(a[i])) {
                                list1.add(a[i]);
                            }
                        }
                }
                System.out.println(count);
                int max=maximum(list);
                list2.add(max);
                list.clear();

            }
            count=1;
        }
        for (int i=0; i<list2.size(); i++){
            if(list2.get(i)==0){
                list2.remove(i);
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }
    public static int maximum(List<Integer> list){
        int max=0;
        for (int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}