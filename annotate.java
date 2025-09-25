class parent{
    void thisIsaBigMethod(){
System.out.println("this is a parent method");
    }
}

class add extends parent{
    @Override // this method is goint to show error when there is a difference in method name so to avoid this annotations are used
    void thisIsaBigMethod(){
        System.out.println("this is a child method");
    }
}

public class annotate {
    public static void main(String[] args){
        add obj=new add();
        obj.thisIsaBigMethod();
    }
    
}
