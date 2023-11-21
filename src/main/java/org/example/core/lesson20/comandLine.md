Следующей командой смотрим где на Mac установлена Java
``` 
echo $(/usr/libexec/java_home)
```
Далее входим в директорию где установлена Java. (Запросит пароль)
``` 
sudo /Users/mitya.kulikbk.ru/Library/Java/JavaVirtualMachines/corretto-19.0.2/Contents/Home
```
На рабочем столе создаем папку с файлом расширение которого .java 
и пишем в нем любой код и сохраняем, пример кода:
```java
class Program {

	public static void main(String args []) {
		System.out.println("Hello");
	}
	
}
```
Заходим через Терминал в папку
```
cd /Users/mitya.kulikbk.ru/Desktop/test
```
Компелируем код командой
```
javac Draft.java
```
Запускаем код командой
```
java Draft.java 
```