package main.java.ua.goit.hw8;

import javax.print.attribute.standard.PrinterName;

public class PrintShape {
    public static void main(String[] args) {
        PrintName printName = new PrintName();
        System.out.println(printName.printName(new Circle()));
        System.out.println(printName.printName(new Quad()));
        System.out.println(printName.printName(new Rectangle()));
        System.out.println(printName.printName(new Triangle()));
        System.out.println(printName.printName(new Diamond()));
    }
}
