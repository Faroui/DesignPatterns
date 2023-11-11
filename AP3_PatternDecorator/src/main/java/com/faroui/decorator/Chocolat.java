package com.designpattern.decorator;

import com.designpattern.boisson.Boisson;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) { super(boisson); }
    public double cout() { return 0.20 +boisson.cout() ;
    }
    public String getDescription() {
        return boisson.getDescription()+", Chocolat";
    }
}

