#### Метод `filter()` принимает `Predicate` этот предикейт возвращает `true` или `false` если условие совпадает заданному в методе `filter()`

```java
public class MethodFilter {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );

        students.stream()
                .filter(it -> it.age > 23 && it.avGrade < 7.4)
                .forEach(System.out::println);
    }
}
```

#### Для преобразования потока в `List` используется `collect(Collectors.toList())`
```java
public class MethodFilter {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );
        List<Student> list = students.stream().filter(it -> it.age >23 && it.avGrade < 7.4).collect(Collectors.toList());
        System.out.println(list); // [Student{name='Ivan', sex=m, age=24, course=1, avGrade=3.4}]
    }
}
```