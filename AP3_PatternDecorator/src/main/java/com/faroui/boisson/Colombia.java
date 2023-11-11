package com.designpattern.boisson;

public class Colombia extends Boisson{
    public Colombia(){
        description ="Colombia";
    }
    @Override
    public double cout() {
        return .89;
    }
}
