`findFirst()` Возвращает первый элемент стрима. Возвращает Optional.
```java
public class FindFirst {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Student find = students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        })
                .filter(el -> el.getSex() == 'm')
                .sorted((e, b) -> e.getAge() - b.getAge())
                .findFirst().get();
        System.out.println(find);
    }
}
```
``` 
Student{name='DMITRII', sex=m, age=19, course=4, avGrade=4.4}
```