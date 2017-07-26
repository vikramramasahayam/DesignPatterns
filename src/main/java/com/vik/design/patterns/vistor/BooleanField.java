package com.vik.design.patterns.vistor;

public class BooleanField extends Field {

    private final Boolean value;

    public BooleanField(final boolean value) {
        this.value = value;
    }

    @Override
    public FieldTypes getType() {
        return FieldTypes.BOOLEAN;
    }

    public Boolean getValue() {
        return value;
    }

    public class BooleanEvaluator implements FieldEvaluator<Boolean> {

        public Boolean evaluator(final Field field) {
            return true;
        }

    }

    @Override
    public <T> T accept(final FieldVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
