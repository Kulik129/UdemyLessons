### `mapToInt()` возвращает стрим `Int` с методом `mapToInt` обязательно нужно использовать `boxed()`
`boxed` конвертирует `int` в `Integer`
```java
public class MethodMapToInt {

    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        List<Integer> courses = students.stream().mapToInt(el -> el.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(courses);
    }
}
```
``` 
[4, 4, 2, 1, 4]
```
___

### `mapToInt()` вместе с `sum()` вычисляет сумму элементов
```java
public class MethodMapToInt {

    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        int sum = students.stream().mapToInt(el -> el.getAge()).sum();
        System.out.println(sum);
    }
}
```
___
### `mapToInt()` вместе с `average()` вычисляет сумму элементов, возвращает `double` поэтому обязательно используется `getAsDouble()`
```java
public class MethodMapToInt {

    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        double average = students.stream().mapToDouble(el -> el.getAvGrade()).average().getAsDouble();
        System.out.println(average);
    }
}
```
___

### `mapToInt()` вместе с `min()` вычисляет минимальное значение, возвращает `double` или `int` поэтому обязательно используется `getAsDouble()` или `getAsInt()`
