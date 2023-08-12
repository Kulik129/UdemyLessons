package org.example.lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura figura = new Kvadrat();
        System.out.println(figura.kolichestvoStoron); // 0
        figura.perimetr(); // Периметр квадрата 40
    }
}

abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;

    int storona1 = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата " + storona1 * 4);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;

    int storona1 = 8;
    int storona2 = 6;

    public void perimetr() {
        System.out.println("Периметр прямоугольника " + (storona1 + storona2) * 2);
    }

    public void ploshad() {
        System.out.println("Площадь прямоугольника " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int radius = 3;
    int kolichestvoStoron = 4;

    public void perimetr() {
        System.out.println("Периметр окружности " + 2 * 3.13 * radius);
    }

    public void ploshad() {
        System.out.println("Площадь окружности " + 3.14 * radius * radius);
    }
}
abstract class Chtyrehugolnik {
    void def(){
        System.out.println("Это четырех угольник");
    }
}