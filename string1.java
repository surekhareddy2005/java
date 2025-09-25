



public class string1 {
    public static void main(String[] args) {
        char[] charArray={'h','i'};
        System.out.println(charArray);

        // character arrsys does not have any built in funcions
        for(int i=0;i<charArray.length;i++){
            System.out.println(charArray[i]);
        }
        // strings are immutable
        // length() is used to get the size of string
        // charAt(i) is used to get a particular character at a give index
         String s="hi";
         for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
         }
            
         // to covert string into char array
         String college="Adityo";
         char[] array=college.toCharArray();
         array[5]='a';
         // converting char array to strings
         String newString=new String(array);
         System.out.println(newString);

         // its not possible to write for each loop on  a string
         // but its possible to write on char array

         for(char each:college.toCharArray()){
            System.out.println(each);
         }

    }
    
}
