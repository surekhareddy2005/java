import java.util.Arrays;

import javax.swing.plaf.synth.SynthStyle;
public class stringarray {
    public static void main(String[] args) {
        // method->parameters->return type->description
        //toString()->an array->string->return a string in which array elements are separated using commas and enclosed with square brackets
        int[] arr={10,20,30};
        System.out.println(Arrays.toString(arr));
        String[] str={"hi", "ki","gi"};
        System.out.println(Arrays.toString(str));

        //fill() -> an array value -> void->fills all the array elements with given values
        int a[]=new int[5];a
        Arrays.fill(a,-1);
        System.out.println(Arrays.toString(a));

        //fill()->an array start index,end index,value->void->fills the indexes from stratindex(inlclided) to endindex(excluded) with given value
        int[] b=new int[10];
        Arrays.fill(b,2,9,4);
        System.out.println(Arrays.toString(b));

        // sort()->an array->void->performs sort in ascending order of the values in place to perform sorting internallh this method uses dual-pivot quicks sort.O(nlog(n))
         int[] crr={4,3,6,5};
         Arrays.sort(crr);
         System.out.println(Arrays.toString(crr));// sorting in place means the original array will be changing

         // equals()->two arrays->boolean->compares two arrays lexicographyically ans rturn true if first array ans second array are same else return false
         int[] geetha={10,20,30};
         int[] surekha={10,20,30};
          System.out.println(Arrays.equals(geetha,surekha));

          // compare()->2 arrays ->int->compares two arrays lexicographically ans returns a -ve value if array1 is smaller than array2 
          //                                                                                0 if array1=array2
          //                                                                                +ve value if array 1 is greater than array2
          System.out.println(Arrays.compare(geetha,surekha));// the result is not always -1 or zero or 1
          char[] c1={'a','b','c'};
          char[] cs={'z','y','x'};
          System.out.println(Arrays.compare(c1,cs));// if you gice cs,c1 it is going to print 25

          
          //mismatch()->two arrays-> int->returns the index where mismatch takes place
          System.out.println(Arrays.mismatch(geetha,surekha));

          //copyOf()
          //int[] c={2,3,5,6};
          //int[] f=new int[4];
          

          // binary search
          int[] c={34,45,67,87,90};
          System.out.println(Arrays.binarySearch(c,100));
    
// comparing two strings
// using equals
// == is used to check whether they are stroed is same location of different location
    String firstName="hello";
    String secondName="hello";
    boolean result=firstName.equals(secondName);
   System.out.println(result);
  // boolean  firstName.equalsIgnoreCase(secondName);
 
   // compateTo
   // if both are equal it is goint to print 0
   // if s1 is > s2 it is going to give some positive value
   // is s2> s1 it is goint to give some negative value 
   // the value is nothing but the ascii value difference of 1st differing characters
    String s1="Sarekha";
    String s2="Surekha";
    System.out.println(s1.compareTo(s2));
    // compareToIgnore()
    String s3="Surekha";
    String s4="surekha";
    System.out.println

    //length uppercase lowercase endswith startswith contains(only string)cch
    // to covert into string (""+ch);
    }
    String
}
