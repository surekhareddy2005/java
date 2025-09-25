interface IntegerOperation{
    // one abstract method
    int operate(int a,int b);
}

// find the sum of factors of two given numbers
interface MathOperation{
    int operations(int a,int b);

}
// class add implements IntegerOperation{                    insted of writing these classes lambada functions are used
// public int operate(int a,int b){
//     return a+b;
// }
// }
// class Multipli implements IntegerOperation{
    
//     public int operate(int a,int b){
//         return a*b;
//     }
// }

public class functional {
    public static void main(String[] args){
    //    add obj=new add();
    //     System.out.println(obj.operate(10,20));
    //     Multipli s =new Multipli();
    //     System.out.println(s.operate(10,30));

    IntegerOperation x=(a,b)->a+b;                 //anonymous implementation of interface
    System.out.println(x.operate(10,20));     // also called as lambda in java
    IntegerOperation y=(a,b)->a*b;                // here actually a class will be created,but its internallu handled java
    System.out.println(y.operate(10,30));

    MathOperation c1=(a,b)->
    {
        int f1=0,f2=0;
        for(int i=1;i<=a;i++) if(a%i==0) f1++;
        for(int i=1;i<=b;i++) if(b%i==0) f2++;
        return f1+f2;
    };
    System.out.println(c1.operations(2,3));
    
    }
    
}
