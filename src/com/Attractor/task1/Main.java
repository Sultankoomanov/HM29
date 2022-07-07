package com.Attractor.task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort(Cat::sortBreed);
        Printer.print(cats);

        cats.sort(Cat::sortName);
        Printer.print(cats);

        cats.sort(Cat::sortAge);
        Printer.print(cats);

        cats.removeIf(Cat::nameEmptyFive);
        Printer.print(cats);

//        cats.removeIf(Cat::catColor);
//        Printer.print(cats);


        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
