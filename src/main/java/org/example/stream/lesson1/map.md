#### Метод `map()` по очереди берет элемент из нашего стрима и сопоставляет ему элемент который из него получается после применения на нем тех действий которые мы описываем внутри `map()` с помощью лямбда выражения.

```java
public class MethodMap {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Hi", "How are you?", "Do your fine?");
        list.stream()
                .map(elem -> elem.length())
                .forEach(System.out::println);
    }
}
```

#### Для преобразования потока в `List` используется `collect(Collectors.toList())`
```java
public class MethodMap {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Hi", "How are you?", "Do your fine?");
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2); // 5 2 12 13
    }
}
```