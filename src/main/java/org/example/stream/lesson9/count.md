### Метод count() выводит к- во элементов в стриме и возвращает лонг

```java
public class MethodCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3,4,5,6);
        System.out.println(stream.count()); // 11 
    }
}
```