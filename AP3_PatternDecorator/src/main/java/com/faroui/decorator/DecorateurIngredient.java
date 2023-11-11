package com.designpattern.decorator;

import com.designpattern.boisson.Boisson;

public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;
    public DecorateurIngredient(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
