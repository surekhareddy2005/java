//java allows us to write
// 1.generic methods
//2.generic classes
//3.generic interfaces
// to handle different types to data without having the reqirement write same code multiple times.
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student("+name+","+age+")";
    }
}
public class Generics {
    // T indicates type
      public static <T> void print(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }
    
    //   public static void print(Integer[] arr){
    //     for(Integer i:arr){
    //         System.out.println(i);
    //     }
    //   }
    //   public static void print(Double[] arr){
    //     for(Double i:arr){
    //         System.out.println(i);
    //     }
    //   }
    //   public static void print(String[] arr){
    //     for(String i:arr){
    //         System.out.println(i);
    //     }
    //   }
    

    public static void main(String[] args){
        Integer[] intArray={10,20,30,40,50};
        print(intArray);
        Double[] doubleArray={45.6,77.9,107.6};
        print(doubleArray);
        String[] stringArray={"ab","bc","cd","ef"};
        print(stringArray);
        Student[] students={new Student("surekha",19),new student("tulasi",19)};
        print(students);
    }
    
}
