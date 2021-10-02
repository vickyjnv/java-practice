package Operators;

public class ArithematicOperations {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(sub(3,2));
        System.out.println(mul(2,3));
        System.out.println(div(4,2));
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }


}
