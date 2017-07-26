package com.vik.design.patterns.visitor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.vik.design.patterns.vistor.AbstractEvaluator;
import com.vik.design.patterns.vistor.BooleanField;
import com.vik.design.patterns.vistor.ContinousField;
import com.vik.design.patterns.vistor.Field;
import com.vik.design.patterns.vistor.OrdinalField;
import com.vik.design.patterns.vistor.SampleVisitor;

public class VistorDesignTest {

    @Test
    public void vistorPatternTest() {
        Field booleanField = new BooleanField(true);
        Field continousField = new ContinousField(10d);
        Field ordinalField = new OrdinalField("Black");
        List<Field> list = Arrays.asList(booleanField, booleanField, continousField, ordinalField);

        List<AbstractEvaluator> evaluators = list.stream().map(f -> f.accept(new SampleVisitor())).collect(Collectors.toList());

        System.out.println(evaluators.size());
    }

}
