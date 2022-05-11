package cts.main;

import cts.clase.DecoratorAbstract;
import cts.clase.DecoratorConcret;
import cts.clase.PrintBilet;
import cts.clase.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer=new PrintBilet();
        printer.printBilet();

        DecoratorAbstract decoratorAbstract=new DecoratorConcret(printer, "La multi ani!");
        decoratorAbstract.printBilet();
        decoratorAbstract.printeazaMesaj();
    }
}
