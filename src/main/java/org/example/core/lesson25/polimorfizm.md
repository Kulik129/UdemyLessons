### Полиморфизм это способность объекта принимать несколько форм.
### Полиморфизм это способность метода вести себя по-разному в зависимости от того объект какого класса вызывает этот метод.
#### Объект в Java считается полиморфным если он имеет более 1-й связи IS-A. 
* Перезаписанные методы часто тоже называют полиморфными. 
Например, метод eat() для червя и льва будет работать по-разному, 
червь ест землю, а лев мясо. 
```java
public class Test {
    public static void main(String[] args) {
        Employ employ1 = new Teacher();
        Employ employ2 = new Driver();
        Employ employ3 = new Doctor();
        employ1.work();
        employ2.work();
        employ3.work();
    }
}
abstract class Employ{
    void sleep(){
        System.out.println("Employ slips");
    }
    abstract void work();
}
class Teacher extends Employ{
    @Override
    void work() {
        System.out.println("Teacher work");
    }
}
class Driver extends Employ{
    @Override
    void work() {
        System.out.println("Driver work");
    }
}
class Doctor extends Employ{
    @Override
    void work() {
        System.out.println("Doctor work");
    }
}
```
---
#### Casting- _это когда мы заставляем переменную одного типа данных вести себя как переменная другого типа данных._
#### Casting - _возможен тогда когда между классами/интерфейсами существует IS-A взаимоотношение. Делая кастинг мы не меняем тип данных объекта, а заставляем его чувствовать себя как объект другого типа._
```java
public class Test1 {
    public static void main(String[] args) {
        Emplo em = new Doc();
        Emplo em1 = new Teach();
        Emplo em2 = new Dri();
        Doc doc = (Doc) em; // Кастим переменную. Мы говорим компилятору, чтобы он поверил, что em это на самом деле доктор
        System.out.println(doc.spec); // khirurg
    }
}

class Emplo {
    double salary = 100;
    String name = "Tom";
    int age;
    int expiriense;

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Doc extends Emplo {
    String spec = "khirurg";

    void lecit() {
        System.out.println("Lechit");
    }
}

class Teach extends Emplo {
    int count;

    void count() {
        System.out.println("Count");
    }
}

class Dri extends Emplo {
    int poezdki;

    void drive() {
        System.out.println("Drive");
    }
}
```