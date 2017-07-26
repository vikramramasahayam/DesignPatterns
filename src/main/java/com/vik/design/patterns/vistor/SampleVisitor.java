package com.vik.design.patterns.vistor;

import com.vik.design.patterns.vistor.Field.FieldVisitor;

public class SampleVisitor implements FieldVisitor<AbstractEvaluator> {

    public AbstractEvaluator visit(final BooleanField field) {
        return new BooleanEvaluator();
    }

    public AbstractEvaluator visit(final ContinousField field) {
        return new ContinousEvalutor();
    }

    public AbstractEvaluator visit(final OrdinalField field) {
        return new OrdinalEvalutor();
    }

}
