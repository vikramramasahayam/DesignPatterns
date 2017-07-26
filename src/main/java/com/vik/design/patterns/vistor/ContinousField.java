package com.vik.design.patterns.vistor;

public class ContinousField extends Field {

    private final Double value;

    public ContinousField(final Double value) {
        this.value = value;
    }

    @Override
    public FieldTypes getType() {
        return FieldTypes.CONTINUOUS;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public <T> T accept(final FieldVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public class ContinousEvaluator implements FieldEvaluator<Double> {

        public Double evaluator(final Field field) {
            return 10d;
        }

    }

}
