package com.futurecollars.lesson09;

public enum TshirtSize {
    S("S", 50),
    M("M", 55),
    L("L", 65),
    XL("M", 55),
    XXL("M", 55),
    XXXL("M", 55);

    private String name;
    private int length;

    TshirtSize(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
