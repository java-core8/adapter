package ru.tcreator;

public class Main {
    static public void main(String ...args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.mult(1, 2));
        System.out.println(calc.pow(5, 6));
        System.out.println(calc.sum(4, 6));

    }
}
