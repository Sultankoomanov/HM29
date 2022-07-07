package com.Attractor.task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort((p1, p2) -> p1.getBreed().compareTo(p2.getBreed()));
        Printer.print(cats);

        cats.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        Printer.print(cats);

        cats.sort((p1, p2) -> p1.getAge() - (p2.getAge()));
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
