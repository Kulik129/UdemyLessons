``` 
Arrays.compare(array3,array4) - 

Возвращает 0 если равны массивы
Меньше 0 если первый меньше второго
Больше 0 если второй больше первого

```
```java
public class Test3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {8,2,3,5};
        int[] array3 = {8,2,3,5};

        char[] array4 = {'p','i','v','e','t'};
        char[] array5 = {'p','i','v','e','t','o'};
        char[] array6 = {'p','i','v','i','v','k','a'};

        System.out.println(Arrays.compare(array1,array2)); // -1
        System.out.println(Arrays.compare(array3,array2)); // 0

        System.out.println(Arrays.compare(array4,array5)); // -1
        System.out.println(Arrays.compare(array5,array6)); // -4
    }
}
```
---
``` 
Arrays.mismatch(array4,array5) -

Находит индекс первого расхождения массивов 
или -1 если они одинаковые
```

```java
public class Test3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,5};
        int[] array3 = {8,2,3,5};

        char[] array4 = {'p','i','v','e','t'};
        char[] array5 = {'p','i','v','e','t','o'};
        char[] array6 = {'p','i','v','i','v','k','a'};

        System.out.println(Arrays.mismatch(array1,array2)); // 3
        System.out.println(Arrays.mismatch(array4,array5)); // 5

    }
}
```