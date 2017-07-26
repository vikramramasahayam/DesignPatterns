package com.vik.design.patterns.vistor;

public class OrdinalField extends Field {

    private final String value;

    public OrdinalField(final String value) {
        this.value = value;
    }

    @Override
    public FieldTypes getType() {
        return FieldTypes.ORDINAL;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(final FieldVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public class OrdinalEvaluator implements FieldEvaluator<String> {

        public String evaluator(final Field field) {
            return "hello";
        }

    }

}
