#### Метод reduce() применяем тогда когда на выходе хотим получить только один элемент, тоесть уменьшаем n-е к-во элементов в стриме до одного. 
```java
public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 3, 4, 5, 2, 6);
        int res = integers.stream().reduce((a, b) -> a * b).get();
        System.out.println(res);
    }
}
```
#### В a хранится первый элемент в b храниться следующий, a и b умножаются и результат кладется в а.
* а = 1 b =  5  --->   1 * 5 = 5
* a = 5 b =  3  --->   5 * 3 = 15
* a = 15 b = 4 --->    15 * 4 = 60