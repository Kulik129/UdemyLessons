#### Метод `chaining()` это когда мы последовательно вызываем методы.
```java
public class MethodChaining {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 12, 4, 3, 98, 56, 4, 3, 11};
        int res = Arrays.stream(arr)
                .filter(el -> el % 2 == 1)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).reduce((a, e) -> a + e)
                .getAsInt();
        System.out.println(res); // 22
    }
}
```

### Перевод имен в верхний регистр, фильтрация по полу, сортировка.
```java
public class MethodChaining {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );
        students.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getSex() == 'm')
                .sorted((e, y) ->
                        e.getCourse() - y.getCourse()
                )
                .forEach(System.out::println);
    }

}
```
### Промежуточных методов может быть много, но они не будут использованы пока не будет вызвана терминльная операция.

В Java Stream API промежуточные операции (intermediate operations) выполняют преобразования или фильтрацию данных и возвращают новый стрим. 
**Вот некоторые из промежуточных операций в Java Stream API:**

1. `filter(Predicate<T> predicate)` - фильтрация элементов по заданному условию.
2. `map(Function<T, R> mapper)` - преобразование каждого элемента стрима с использованием заданной функции.
3. `flatMap(Function<T, Stream<R>> mapper)` - преобразование каждого элемента стрима в другой стрим и объединение результатов.
4. `distinct()` - удаление дубликатов из стрима.
5. `sorted()` - сортировка элементов стрима по их естественному порядку.
6. `peek(Consumer<T> action)` - выполнение заданного действия для каждого элемента стрима без изменения его содержимого.
7. `limit(long maxSize)` - ограничение стрима определенным количеством элементов.
8. `skip(long n)` - пропуск определенного количества элементов стрима.

В Java Stream API терминальные операции (terminal operations) выполняют вычисления и завершают обработку стрима. 
**Вот некоторые из терминальных операций в Java Stream API:**

1. `forEach(Consumer<T> action)` - применение заданного действия к каждому элементу стрима.
2. `toArray()` - преобразование стрима в массив.
3. `reduce(BinaryOperator<T> accumulator)` - выполнение агрегирующей (редукционной) операции на элементах стрима с использованием заданного бинарного оператора.
4. `collect(Collector<T, A, R> collector)` - сбор элементов стрима с использованием заданного коллектора.
5. `min(Comparator<T> comparator)` - нахождение минимального элемента стрима с использованием заданного компаратора.
6. `max(Comparator<T> comparator)` - нахождение максимального элемента стрима с использованием заданного компаратора.
7. `count()` - подсчет количества элементов в стриме.
8. `anyMatch(Predicate<T> predicate)` - проверка, соответствует ли хотя бы один элемент стрима заданному условию.
9. `allMatch(Predicate<T> predicate)` - проверка, соответствуют ли все элементы стрима заданному условию.
10. `noneMatch(Predicate<T> predicate)` - проверка, не соответствует ли ни один элемент стрима заданному условию.
11. `findFirst()` - нахождение первого элемента стрима.
12. `findAny()` - нахождение любого элемента стрима.

Терминальные операции запускают обработку данных в стриме и возвращают конечный результат.