```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        System.out.println(sb2.length()); // 9
        System.out.println(sb2.charAt(5)); // d
        System.out.println(sb2.indexOf(" ")); // 4
        String s = sb2.substring(5);
        System.out.println(s); // day!
        String s2 = sb2.substring(5,8);
        System.out.println(s2); // day 
    }
}
```

``` 
subsequence(int start, int end) - Метод отрыдвок последовательности символов 
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        System.out.println(sb2.subSequence(5, 8)); // day
    }
}
```
---
``` 
append(dataType) - В конец значения добавляет дополнительно значение
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        sb2.append(22);
        System.out.println(sb2); // Good day!22
    }
}
```
---
``` 
insert(int toIndex, dataType dt) - Вставляет на опрределенную позицию какое-то значение
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        System.out.println(sb2.insert(4,"_")); // Good_ day!
        System.out.println(sb2.insert(9,78)); // Good_ day78!
    }
}
```
---
``` 
delete(int start, int end) - Удаляет символы с и до поределенного индекса
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        sb2.delete(3,6);
        System.out.println(sb2); // Gooay!
    }
}
```
---
``` 
deleteCharAt(int index) - Удаляет индекс
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        sb2.deleteCharAt(8);
        System.out.println(sb2); // Good day
    }
}
```
---
``` 
reverse() - Переворачивает строку
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        sb2.reverse();
        System.out.println(sb2); // !yad dooG
    }
}
```
---
``` 
replace(int start, int end, String s) - Меняет отрезок, начиная с определенной позиции
заканчивая энной позицией, на орпеделенный стринг
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        sb2.replace(0, 5, "Bad ");
        System.out.println(sb2); // Bad day!
    }
}
```
---
``` 
capacity() - К-во мест в массиве для символов
```
```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good day!");
        System.out.println(sb2.capacity()); // 25
    }
}
```

``` 
equals() - Работает не так как в классе String. Он рабоате так же как и ==
```

```java
public class Example {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        System.out.println(sb1.equals(sb2)); // false
    }
}

public class Example {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        System.out.println(sb1.equals(sb3)); // true
    }
}
```