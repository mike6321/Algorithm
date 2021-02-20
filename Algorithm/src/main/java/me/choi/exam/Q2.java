package me.choi.exam;

/**
 * Project : Algorithm
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:16 오후
 */
public class Q2 {
    public static void main(String[] args) {
        Employee one = new Permanent();
        Employee two = new Salesman();
        one.sabun = 1;
        one.name = "lji";
        two.sabun = 2;
        two.name = "cks";

        one.print();
        two.print();
    }
}

abstract class Employee {
    int sabun;
    String name;

    abstract int getSalary();

    void print() {
        System.out.println(sabun + ", " + name + ", " + getSalary());
    }
}

class Permanent extends Employee {
    int getSalary() {
        return 100;
    }
}

class Salesman extends Permanent {
    int getSalary() {
        return 10 + super.getSalary();
    }
}
