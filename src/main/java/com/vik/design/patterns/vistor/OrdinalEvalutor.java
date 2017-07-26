package com.vik.design.patterns.vistor;

public class OrdinalEvalutor extends AbstractEvaluator {

    @Override
    public boolean evaluate(final Field field) {
        OrdinalField ordinalField = (OrdinalField) field;
        return ordinalField.equals("bla");
    }

}
