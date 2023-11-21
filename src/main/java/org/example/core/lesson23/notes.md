
``` 
Method overriding (не путать с overloaded!)
```
##### Это изменение non-static, non-final метода в sub классе, который он унаследовал от parent класса.
##### Методы считаются перезаписанными если:
* Имя в sub классе такое же как и в parent классе
* Список аргументов в sub классе такой же как и в parent классе
```java
class Employ {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Я поел");
    }
}

class Teacher extends Employy {
    String name;

    void eat() {
        System.out.println("Учитель поел вкусную гречу");
    }
}
```
---
* Return type в sub классе такое же как и в parent классе или же return type  в sub классе - это sub класс return type из parent класса
```java
class Meal {

}

class Fruits extends Meal {

}

class Employ {
    String name;
    int age;
    int experience;

    Meal eat() {
        System.out.println("Работник поел");
        Meal meal = new Meal();
        return meal;
    }
}

class Teacher extends Employy {
    String name;

    Fruits eat() {
        System.out.println("Учитель поел вкусную гречу");
        Fruits fruits = new Fruits();
        return fruits;
    }
}
```
---
```
Что можно перезаписать (overriding):
```
* Все методы которые не являются private, static, final
``` 
Что можно скрыть (hide): 
```
* Статические методы 
* Не приватные переменные

``` 
Приватные методы и переменные нельзя скрыть или перезаписать
```
```
final методы нельзя скрыть или перезаписать  
```
```
Можно использовать аннотацию @Override когда перезаписываем метод 
```
```java
class Employ {
    void eat() {
        System.out.println("Работник поел");
    }
}
class Teacher extends Employy {
    String name;
    
    @Override
    void eat() {
        System.out.println("Учитель поел вкусную гречу");
    }
}
```
---
``` 
final метод - нельзя скрыть или перезаписать
```

```java
class Animal {
    final void getName() { // final 
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() { // ошибка копиляции
        System.out.println("Mouse");
    }
}
```
---
```
final class - это класс который не может иметь потомков
```
```java
final class Animal { // final
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal { // ошибка копиляции
    void getName() {
        System.out.println("Mouse");
    }
}
```
---

``` 
Полиморфизм - это способность объекта принимать разные формы.
Полиморфизм - это способность метода делать разные вещи в зависимости от того каким объектом был вызван этот метод.
```
---
``` 
this. - означает обращение к ТЕКУЩЕМУ объекту
super. - означает обращение к объекту РОДИТЕЛЬСКОГО класса. Можно обращаться как к методам так и к переменным родительского класса.
```
``` 
super  нельзя употреблять В static методах и переменных. super не используем в static методах.
```
```
Для того чтобы обратиться к элементам род. класса с помощью super, эти элементы должны быть видны в родительском классе
```

Если нужно перезаписать метод из родительского класса и дополнить его, используем super.
Допустим нужно долнить метод sum, что бы не переписывать то что уже было используем super:
```java
public class A10 {
    int sum(int ...i){
        int res = 0;
        for (int a: i){
            res+=a;
        }
        return  res;
    }
}
class B10 extends A10 {
    
    @Override
    int sum(int ...i){
        int res = super.sum(i);
        System.out.println(res);
        return  res;
    }
}
```
---
```
с помощью super можем в НЕ СТАТИЧЕСКОМ МЕТОДЕ вызвать статический метод super класса
```
```java
public class A10 {
    int sum(int ...i){
        int res = 0;
        for (int a: i){
            res+=a;
        }
        return  res;
    }
    static void abc(){
        System.out.println("static");
    }

}
class B10 extends A10 {

    @Override
    int sum(int ...i){
        int res = super.sum(i);
        System.out.println(res);
        super.abc(); // с помощью super можем в НЕ СТАТИЧЕСКОМ МЕТОДЕ вызвать статический метод super класса
        return  res;
    }
}
```