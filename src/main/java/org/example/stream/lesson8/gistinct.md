### Метод distinct() возвращает стрим уникальных элементов и проверяет он их с помощью equals.

```java
public class MethodDistinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6);
        stream.distinct()
                .forEach(System.out::println);
    }
}
```
