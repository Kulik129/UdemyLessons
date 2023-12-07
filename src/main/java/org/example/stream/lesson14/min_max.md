### `min()` и `max()` используются для нахождения минимального или максимального значения. Принимают comparator
```java
public class MethodMinAndMax {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Student min = students.stream().min((a, b) -> a.getAge() - b.getAge()).get();
        System.out.println(min);

        Student max = students.stream().max((a, b) -> a.getAge() - b.getAge()).get();
        System.out.println(max);
    }
}
```
``` 
Student{name='Mariya', sex=f, age=18, course=4, avGrade=4.1}
Student{name='Ivan', sex=m, age=24, course=1, avGrade=3.4}
```