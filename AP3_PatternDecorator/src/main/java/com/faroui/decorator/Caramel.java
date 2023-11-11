package com.designpattern.decorator;

import com.designpattern.boisson.Boisson;

public class Caramel extends DecorateurIngredient {
    public Caramel(Boisson boisson) { super(boisson); }
    public double cout() { return 0.22 +boisson.cout() ; }
    public String getDescription() {
        return boisson.getDescription()+", Caramel";
    }
}
