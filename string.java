public class string {

    public static void main(String[] args) {
        //string is not a data type but it is a class
        String name=new String("surekha");
        System.out.println("hello "+name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" reddy"));

        /* strings
           /  \
      mutable  immutable
     (change)  (unchangeable)
     basically the strings are immutable to change it into string buffer and string builder is used*/

     // string buffer
     StringBuffer st= new StringBuffer();
     System.out.println(st.capacity());// buffer gives extra 16 to give reallocation 
     StringBuffer str= new StringBuffer("surekha");
     System.out.println(str.capacity());
     System.out.println(str.length());
     // append
     str.append(" reddy");
     System.out.println(str);
     // converting into string
     String s= str.toString();
     System.out.println(s);
     //inserting
    str.insert(0,"hi ");
    System.out.println(str);   
    // delete char at given position
    System.out.println(str.deleteCharAt(4));   
    // delete from index to index it doesn't remove last index char
    System.out.println(str.delete(0,2));
    //concat
    String firstName="geetha ";
    String lastName="sri";
    System.out.println(firstName.concat(lastName));
    // concat string and numbrer
    int number=56;
    String letter="89";
    System.out.println(number+letter);

              




        
    }
}

