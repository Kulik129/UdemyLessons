```
length() - Длинна строки. 
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.length()); // 15
    }
}
```
---
```
charAt(3) - третий символ строки.
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.charAt(3)); // l
    }
}
```

---

```
indexOf() - узнать на каком индексе находится char или string
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.indexOf("e")); // 1
    }
}
```
---
``` 
indexOf(String s, int fromIndex) - Узнать на каком индексе находится char или string 
начиная с какого индекса
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.indexOf("m",3)); // 6
    }
}
```
---
```
startsWith("abс") - Начинается ли строка с "abc"? Возвращает true или false  
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.startsWith("Hello")); // true
        System.out.println(s.startsWith("abc")); // false
    }
}
```
---
```
startsWith("my", 6) - Начиная с 6-го индекса, начинается ли строка с my  
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.startsWith("my", 6)); // true
    }
}
```
---
```  
endsWith(String suffix) - Заканчивается ли строка таким то словом
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.endsWith("friend")); // true
        System.out.println(s.endsWith("end")); // true
        System.out.println(s.endsWith("nd")); // true

    }
}
```
---
``` 
substring(int beginIndex) - Начало индекса с которого обрезать строку
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.substring(3)); // lo my friend
    }
}
```
---
```  
substring(int beginIndex, int endIndex) - Обрезать строку 
с 3 по 10 индекс (10-й не включительно)
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.substring(3, 10)); // lo my f
    }
}
```
---
```  
trim() - Обрезать пробелы в начале и конце строки
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "    Hello my friend     ";
        System.out.println(s.trim()); // Hello my friend
    }
}
```
---
``` 
replace(oldString, newString) - Заменить символ
```
```java
public class Example {
    public static void main(String[] args) {
        String s = "Hello my friend";
        System.out.println(s.replace("Hello","Zero")); // Zero my friend
    }
}
```
---
```java
public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.isBlank()); // false если есть символы типа Р Н и т.д.

        String s2 = " ";
        System.out.println(s2.isBlank()); // true если есть Табы или Пробелы

        String s3 = "";
        System.out.println(s3.isEmpty()); // true если строка пуста

        String s4 = "    Hello      ";
        System.out.println(s4.strip()); // Удаляет пробелы по бокам как и trim()

        System.out.println(s4.stripLeading()); // Удаляет пробелы в начале строки

        System.out.println(s4.stripTrailing()); // Удаляет пробелы в конце строки
    }
}
```