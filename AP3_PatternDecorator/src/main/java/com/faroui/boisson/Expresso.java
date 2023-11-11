package com.designpattern.boisson;

public class Expresso extends Boisson{
    public Expresso(){
        description ="Expresso";
    }
    @Override
    public double cout() {
        return 1.99;
    }
}
