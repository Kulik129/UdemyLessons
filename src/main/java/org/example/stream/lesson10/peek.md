### Метод `peek()` метод как и forEach только возвращает не void а stream
С помощью этого метода мы можем посмотреть каждый элемент и вывести количество
 ```java
public class MethodPeek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3,4,5,6);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
```