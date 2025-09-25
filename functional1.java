// a custom sort method for strings using functional interface concept
// String[] arr={"tokyo","rio","nairobi","professor",berlin"}
// should bee able to sort the strings based on lexicographical comparison(standard sort)
// berlin,nairobi,proffesor,rio,tokyp\o
// should be able to have an option of sorting the strings based one lengths of strings
// rio,tokyo,berlin,nairobi,proffersor
//
// custom logic
import java.util.Arrays;
interface StringCompare{
    int compare(String s1,String s2); // +value or 0 or -value
}

public class Main2{
    public static void bubbleSort(String[]args, StringCompare com){
       for(int i=0;i<arr.length;i++ {
        for(int j=0;j<)
        
       } 
    }
    
}
public class functional1 {
    public static void main(String[] args) {
        String[] arr={"tokyo","rio","nairobi","professor","berlin"};
        System.out.println("before sorting:"+Arrays.toString(arr));
        bubbleSort(arr,(a,b)->a.length()-b.length());
        bubblesort(arr,(a,b)->a.copareTo(b))

        System.out.println("after sorting:"+Arrays.toString(arr));
    }
    
}
