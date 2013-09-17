package com.mycompany.app;

public class Гетьман {
    private Поход поход;

    public void setПоход(Поход поход) {
        this.поход = поход;
    }

    private String name;

    public Гетьман(String n) {
        this.name = n;
    }

    public void сходитьВПоход(){
        поход.сходитьВПоход();
    }

}
