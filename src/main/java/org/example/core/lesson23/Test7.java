package org.example.core.lesson23;

public class Test7 {
}
class Person {

    static String showName() {
        return "some person";
    }
    void showInfoAboutPerson() {
        System.out.println("Name of person: " + showName());
    }
}
class Jerry extends Person {
    // Метод не перезаписан а скрыт
    // если убрать static в классах метод будет перезаписан
    static String showName() {
        return "Jerry";
    }
    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Jerry jerry = new Jerry();
        jerry.showInfoAboutPerson(); //Name of person: some person// так как метод не перезаписывался а скривался будет использован метод showName() из Person. Класс Person не знает другого метода showName() поэтому компайлТайм определяется что showName() будет вызываться из класса Person потому что он статичный
        jerry.showInfoAboutMouse(); // этот метод имеется только в классе Jerry поэтому будет писаться Name of mouse: Jerry
    }
}
