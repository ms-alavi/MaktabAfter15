package org.maktab.p1;

public class Test  {
    public static void main(String[] args) {
        A[] elements={new D(),new A(),new C(),new B()};
        for (A a:elements
             ) {
            System.out.println(a.method1());
            System.out.println(a.method2());
            System.out.println();
        }
    }
}
