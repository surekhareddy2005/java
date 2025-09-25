class pair<K,V>{
    private K key;
    private V value;
    public pair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getvalue(){
        return value;
    }
    // private String author;
    // private Integer numberOfBooks;
    // public pair(String author, Integer numberOfBooks){
    //     this.author=author;
    //     this.numberOfBooks=numberOfBooks;
    // }
    // public String getKey(){
    //     return author;
    // }
    // public Integer getValue(){
    //     return numberOfBooks;
    // }
}
public class generics1 {
    public static void main(String[] args){
        pair p1=new pair("clone hover",5);
        System.out.println(p1.getKey());
        pair p2=new pair(10,"tulasi");
        System.out.println(p2.getKey());

    }
    
}
