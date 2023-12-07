### `groupingBy()` используется по группировке ПО и возвращает Map<K, V>
Сделать имена студентов заглавными буквами и отсортировать их по курсу, для каждого курса будет свой лист
```java
public class MethodCollect {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);
        
        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Map<Integer, List<Student>> map = students.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> el : map.entrySet()) {
            System.out.println("Course " + el.getKey() + ": " + el.getValue().toString());
        }
    }
}
```
Результат выполнения:
```
Course 1: [Student{name='IVAN', sex=m, age=24, course=1, avGrade=3.4}]
Course 2: [Student{name='VIKTOR', sex=m, age=20, course=2, avGrade=7.4}]
Course 4: [Student{name='MARIYA', sex=f, age=18, course=4, avGrade=4.1}, Student{name='NIKOLAY', sex=m, age=23, course=4, avGrade=8.4}, Student{name='DMITRII', sex=m, age=19, course=4, avGrade=4.4}]
```

### `partitioningBy()` Разделение ПО. Так как принимает predicate то ключ Map должен быть Boolean

Поделим студентов на 2 группы, те кто получает высокую оценку и те кто не получает
```java
public class MethodCollect {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvGrade() > 5));

        for (Map.Entry<Boolean, List<Student>> el : map.entrySet()) {
            System.out.println("Course " + el.getKey() + ": " + el.getValue().toString());
        }
    }
}
```
``` 
Course false: [Student{name='Mariya', sex=f, age=18, course=4, avGrade=4.1}, Student{name='Ivan', sex=m, age=24, course=1, avGrade=3.4}, Student{name='Dmitrii', sex=m, age=19, course=4, avGrade=4.4}]
Course true: [Student{name='Nikolay', sex=m, age=23, course=4, avGrade=8.4}, Student{name='Viktor', sex=m, age=20, course=2, avGrade=7.4}]
```