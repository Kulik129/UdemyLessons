#### Метод `sorted()` сортирует наш список.
```java
public class MethodSorted {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );
        students = students
                .stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName())
                        )
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
```
### Для сортировки собственного класса нужно задать параметры для сортировки используя `compareTo()`

### В случае с примитивами задавать параметры для сортировки не нужно
```java
public class MethodSorted {
    public static void main(String[] args) {
        int[] arr = {7,3,5,1,3,9,5};
        arr = Arrays.stream(arr)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(arr));
    }
}
```