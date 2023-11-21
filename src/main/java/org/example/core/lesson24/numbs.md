## Abstract class and Abstract methods:
```java
abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }
}
```
* У абстрактных методов не бывает тела.
* Невозможно создать объект абстрактного класса.
* Если в классе есть абстрактный метод класс тоже должен быть абстрактным.
* Абстрактный класс может содержать и не содержать абстрактных методов.
* Дочерний класс должен перезаписать все абстрактные методы родительского класса или тоже быть абстрактным. 

```java
// перезаписать все абстрактные методы
class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    
    int storona1 = 10;
    @Override
    public void perimetr() {
        System.out.println("Периметр квадрата " + storona1 * 4);
    }
    @Override
    public void ploshad(){
        System.out.println("Периметр квадрата " + storona1 * storona1);
    }
}
// или тоже быть абстрактным
abstract class Chtyrehugolnik {
    void def(){
        System.out.println("Это четырех угольник");
    }
}
```
---
Можно использовать reference variable типа abstract класса чтобы ссылаться на объект дочернего класса, который не является abstract
```java
public class Test2 {
    public static void main(String[] args) {
        Figura figura = new Kvadrat();
        System.out.println(figura.kolichestvoStoron); // 0
        figura.perimetr(); // Периметр квадрата 40
    }
}
```
* Abstract класс не может быть final
* Переменные не могут быть abstract
---
* У abstract класса может быть конструктор 
```java
abstract class Figura {
    Figura(int kolichestvoStoron ) {
        this.kolichestvoStoron = kolichestvoStoron;
    }
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figura {
    Kvadrat(int kolichestvoStoron){
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }
    int kolichestvoStoron = 4;

    int storona1 = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата " + storona1 * 4);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата " + storona1 * storona1);
    }
}

```
---
* Любой перезаписанный метод может быть как абстрактный так и не абстрактный.
```java
abstract class Kvadrat extends Figura {
    int kolichestvoStoron = 4;

    int storona1 = 10;

    public abstract void perimetr();

    public void ploshad() {
        System.out.println("Площадь квадрата " + storona1 * storona1);
    }
}
```
---
 ## Interface 
Интерфейс -это контракт или протокол в котором говорится что класс может делать классы которые имплементируют этот интерфейс соглашаюся на этот контракт и соглашаются что будут перезаписывать эти методы

* У интерфейса нет конструктора
```java
class Employ {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("я поел");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Teacher extends Employ implements HelpAble {
    int kolUcenikov;

    void uchit() {
        System.out.println("Учу");
    }

    public void help() {
        System.out.println("Учитель помогает");
    }

    public void tushit() {
        System.out.println("Учитель тушит");
    }
}

class Driver extends Employ implements SwimAble, HelpAble {
    String nazvanieMashiny;

    void vodit() {
        System.out.println("Vodit ");
    }

    public void help() {
        System.out.println("Водитель помогает");
    }

    public void tushit() {
        System.out.println("Водитель тушит");
    }

    public void swim() {
        System.out.println("Водитель плавает");
    }
}

interface HelpAble {
    void help();

    void tushit();
}

interface SwimAble {
    void swim();
}
```
---
### Default methods
* default не связан с аксес modifier, по умолчанию все modifier public
```java
interface I1{
    void abc();
    default void df(){
        System.out.println("Method df");
    }
}

class Zero implements  I1 {
    @Override
    public void abc() {
        System.out.println("Method abc");
    }

    @Override
    public void df() {
        System.out.println("@Override df");
    }

    public static void main(String[] args) {
        Zero z = new Zero();
        z.abc();
        z.df();
    }
}
```
* Дефолтный метод ВСЕГДА имеет тело.
* Дефолтные методы можно не перезаписывать. При этом его тоже можно вызывать через объект.
* В случае нужны имплементации метода работает или изменения его работы работает все так же как и с обычным имплементом
* 
