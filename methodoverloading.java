class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,12));
        System.out.println(Adder.add(10,5,7));
    }
}
