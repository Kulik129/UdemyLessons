### `parallelStream()` Используют когда нужно выполнить операции быстрее чем она будет выполниться последовательно. 
### `parallelStream` выполняет задание по частям, а потом работает с теми частями задания
### `parallelStream` подходит для нахождения минимума, максимума или суммы 

```java
public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 2, 12, 2, 23, 23, 1, 4, 5, 656, 23);

        int res = integers.parallelStream().reduce((akum, el) -> akum + el).get();
        System.out.println(res);
    }
}
```
``` 
757
```