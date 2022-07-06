package com.futurecollars.lesson09;

public class OuterClass {

    //statyczna klasa wewnętrzna
    public class InnerClass {

    }

    InnerClass createInnerInstance() {
        return new InnerClass();
    }
}
