package com.futurecollars.lesson9;

public class OuterClass {

    //statyczna klasa wewnętrzna
    public class InnerClass {

    }

    InnerClass createInnerInstance() {
        return new InnerClass();
    }
}
