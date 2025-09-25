
interface parent{
    void method1(); // abstract method
    default void method2(){
        System.out.println("this is a default method");
    }
}
class child implements parent{
    public void method1(){
        System.out.println("hello");
    }
}
public class Interface1 {
public static void main(String[] args){
    child obj=new child();
    obj.method1();
    obj.method2();
}
    
}
