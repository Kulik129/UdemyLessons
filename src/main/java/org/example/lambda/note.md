Лямбда-выражения в Java представляют собой компактный способ передачи функциональности в виде аргумента метода. Они обеспечивают более краткую и выразительную запись кода, особенно при работе с интерфейсами, содержащими один абстрактный метод (функциональные интерфейсы). Вот несколько примеров использования лямбда-выражений:

### Пример 1: Использование в анонимных классах

```java
// Анонимный класс
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
};

// С использованием лямбда-выражения
Runnable lambdaRunnable = () -> System.out.println("Hello, World!");
```

### Пример 2: Использование в интерфейсах с одним методом (функциональных интерфейсах)

```java
// Интерфейс с одним методом
interface MathOperation {
    int operate(int a, int b);
}

// С использованием анонимного класса
MathOperation addition = new MathOperation() {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
};

// С использованием лямбда-выражения
MathOperation additionLambda = (a, b) -> a + b;
```

### Пример 3: Использование в потоках данных (Stream API)

```java
List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");

// Фильтрация с использованием анонимного класса
names.stream().filter(new Predicate<String>() {
    @Override
    public boolean test(String name) {
        return name.startsWith("J");
    }
}).forEach(System.out::println);

// Фильтрация с использованием лямбда-выражения
names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);
```

### Пример 4: Обработка событий

```java
// Обработка событий с использованием анонимного класса
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
});

// Обработка событий с использованием лямбда-выражения
button.addActionListener(e -> System.out.println("Button clicked!"));
```

Лямбда-выражения облегчают написание более чистого и компактного кода, особенно при работе с функциональными интерфейсами. Они становятся особенно мощными в сочетании с новыми возможностями Java 8, такими как Stream API.