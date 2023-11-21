package org.example.core.lesson23;

public class A10 {
    String s1 = "Hi";
    static double d = 3.14;
    int sum(int ...i){
        int res = 0;
        for (int a: i){
            res+=a;
        }
        return  res;
    }
    static void abc(){
        System.out.println("static");
    }

}
class B10 extends A10 {
    String s1 = super.s1 + " friend!"; // Обычно super используется когда мы эту переменную делаем hide

    @Override
    int sum(int ...i){
        int res = super.sum(i);
        System.out.println(res);
        super.abc(); // с помощью super можем в НЕ СТАТИЧЕСКОМ МЕТОДЕ вызвать статический метод super класса
        return  res;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1); // Hi friend!
        b.sum(3,3,3,3);
    }
}
