package com.vik.design.patterns.vistor;

public abstract class Field {

    public abstract FieldTypes getType();

    public abstract <T> T accept(FieldVisitor<T> visitor);

    public interface FieldVisitor<T> {

        public T visit(final BooleanField field);

        public T visit(final ContinousField field);

        public T visit(OrdinalField field);

    }

    public interface FieldEvaluator<T> {

        public T evaluator(Field field);
    }

}
