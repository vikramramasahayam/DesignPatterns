package com.vik.design.patterns.vistor;

public class BooleanEvaluator extends AbstractEvaluator {

    @Override
    public boolean evaluate(final Field field) {
        BooleanField booleanField = (BooleanField) field;
        return booleanField.getValue();
    }

}
