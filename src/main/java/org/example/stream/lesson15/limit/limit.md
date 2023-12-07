`limit()` ограничивает к-во элементов в стриме
Выведем 2-х студентов которые старше 19 лет
```java
public class MethodLimit {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        students.stream().filter(el -> el.getAge() > 19).limit(2).forEach(System.out::println);
    }
}
```
``` 
Student{name='Nikolay', sex=m, age=23, course=4, avGrade=8.4}
Student{name='Viktor', sex=m, age=20, course=2, avGrade=7.4}
```