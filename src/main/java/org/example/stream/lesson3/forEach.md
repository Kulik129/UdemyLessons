#### Метод `forEach()` говорит о том, что сделай с каждым элементом что написано после `->` 
```java
public class MethodForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 22, 3, 4,};
        Arrays.stream(arr).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
    }
}
```

```java
public class MethodForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 22, 3, 4,};
        Arrays.stream(arr).forEach(el -> System.out.println(el)); // 1 2 3 4 5 3 22 3 4
        Arrays.stream(arr).forEach(System.out::println); // 1 2 3 4 5 3 22 3 4
    }
}
```

#### Метод референс. Каждый элемент потока помести в метод `method` в качестве параметра, который находиться в классе `Utils`
```java
public class MethodForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 22, 3, 4,};
        Arrays.stream(arr).forEach(el -> Utils.method(el));
        Arrays.stream(arr).forEach(Utils::method); // короткое написание чем выше
    }
    public static class Utils {
        public static void method(int a) {
            a += 5;
            System.out.println("Element: " + a); // Element: 6 Element: 7 ...
        }
    }
}
```