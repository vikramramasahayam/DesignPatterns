package com.vik.design.patterns.vistor;

public class ContinousEvalutor extends AbstractEvaluator {

    @Override
    public boolean evaluate(final Field field) {
        ContinousField continousField = (ContinousField) field;
        return continousField.getValue().equals(5d);
    }

}
